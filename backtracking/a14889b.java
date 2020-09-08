package backtracking;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class a14889b {
    static int n, min,ccnt,nCr;
    static int[][] stats;
    static int[] team1;
    static int[] team2;
    static int[] pick;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        stats=new int[n][n];
        team1 = new int[n/2];
        team2 = new int[n/2];
        pick=new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                stats[i][j] = s.nextInt();
            }
        }
        nCr = combination(n);
        min = Integer.MAX_VALUE;
        dfs(0,0);
        bw.write(min+"");
        bw.close();
    }

    static void dfs(int idx, int cnt){
         if(ccnt==nCr/2){
             return;
         }
        if(cnt == n/2){
            ccnt++;
            update();
            // System.out.println("-----------------------");
            // System.out.println("team1: "+ Arrays.toString(team1));
            // System.out.println("team2: "+ Arrays.toString(team2));
            // System.out.println("-----------------------");
            return;
        }
        for(int i = idx; i < n;i++){
            pick[i] = 1;
            dfs(i+1,cnt+1);
            pick[i]=0;
            // if(ccnt==nCr/2){
            //     break;
            // }
        }
        return;
    }

    static void update(){
        int team1_size=0;
        int team2_size=0;
        for(int i = 0 ; i<n;i++){
            if(pick[i]==0){
                team1[team1_size++] = i;
            } else{
                team2[team2_size++] = i;
            }
        }

        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < n/2;i++){
            for(int j = i+1; j < n/2;j++){
                sum1 += (stats[team1[i]][team1[j]] + stats[team1[j]][team1[i]]);
                sum2 += (stats[team2[i]][team2[j]] + stats[team2[j]][team2[i]]);
            }
        }

        if(min > Math.abs(sum1-sum2)){
            min = Math.abs(sum1-sum2);
        }
    }

    static int combination(int total){
        int n=1;
        int r=1;
        for(int i = 1; i <= total;i++){
            n*=i;
        }
        for(int i = 1; i <=total/2;i++){
            r*=i;
        }
        return (n/(r*r));
    }
}

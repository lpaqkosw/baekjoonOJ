package backtracking;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class a14889 {
    static int n, idx;
    static int[][] stats;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] start;
    static boolean[] visited;
    static ArrayList<Integer> scores = new ArrayList<Integer>();
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        stats = new int[n][n];
        start = new int[n / 2];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                stats[i][j] = s.nextInt();
            }
        }
        dfs(0, 0, start);
        for(int i = 0; i < scores.size()/2; i++){
            int mid = Math.abs(scores.get(i)-scores.get(scores.size()-i-1));
            if(mid < min){
                min = mid;
            }
        }
        bw.write(min+"");
        bw.close();
    }

    static void dfs(int idx, int cnt, int[] start){
        if(cnt == n/2){
            // System.out.println("start: "+Arrays.toString(start));
            // System.out.println("calc: "+ calcScore(start));
            scores.add(calcScore(start));
            return;
        }
        for(int i = idx; i < n; i++){
            // if(visited[i]){
            //     continue;
            // }
            start[cnt] = i+1;
            // visited[i]=true;
            dfs(i+1,cnt+1,start);
            // visited[i]=false;
        }
    }
    static int calcScore(int[] arr){
        int score =0;
        for(int i =0; i < arr.length;i++){
            for(int j = i+1; j < arr.length;j++){
                score+=(stats[arr[i]-1][arr[j]-1]+stats[arr[j]-1][arr[i]-1]);
            }
        }
        return score;
    }
}

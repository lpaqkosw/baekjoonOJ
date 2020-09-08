package backtracking;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

//N-Queen
public class a9663 {
    static int n,cnt,res;
    static boolean[] visited;
    static int[] col;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
       Scanner s = new Scanner(System.in);
       n = s.nextInt();
       visited = new boolean[n];
       col = new int[n];
       dfs(0,0);

       bw.write(res+"");
       bw.close();
    }

    static void dfs(int idx, int cnt){
        if(cnt == n){
            res++;
            // System.out.println(Arrays.toString(col));
            return;
        }
        for(int i = 0;i < n;i++){
            if(visited[i]){
                continue;
            }
            if(check(i,cnt)){
                visited[i] = true;
                col[cnt] = i;
                cnt++;
                dfs(i,cnt);
                cnt--;
                visited[i] = false;
            }

        }
    }

    static boolean check(int idx, int cnt){
        for(int i =0; i < cnt;i++){
            int r = col[i] +(cnt-i);
            int l = col[i] -(cnt-i);
            if(idx == r || idx == l){
                return false;
            }
        }
        return true;
    }
}
package backtracking;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class a15652 {
    static int n;
    static int m;
    static int[] list;
    static int cnt;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        m = s.nextInt();
        list = new int[m];
        dfs(0, list, 0);
        bw.flush();
    }

    static void dfs(int idx, int[] list, int cnt) throws IOException {
        if(cnt==m){
            for(int x : list){
               bw.write(x+" ");
            }
            bw.write("\n");
            return;
        }
        // if(cnt==m){
        //     StringBuilder sb = new StringBuilder();
        //     for(int x : list){
        //         sb.append(x+" ");
        //     }
        //     System.out.println(sb.toString().trim());
        //     return;
        // }
        for(int i = idx; i<n;i++){
            list[cnt]=i+1;
            cnt++;
            dfs(i,list,cnt);
            cnt--;
        }
        return;
    }
}
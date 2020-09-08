package backtracking;


import java.util.Scanner;

public class a15649 {
    static int n;
    static int m;
    static boolean[] visited;
    static int[] list;
    static int cnt;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        m = s.nextInt();
        visited = new boolean[n];
        list = new int[m];
        dfs(0,list,0);
    }

    static void dfs(int idx,int[] list,int cnt){
        if(cnt==m){
            StringBuilder sb = new StringBuilder();
            for(int x : list){
                sb.append(x+" ");
            }
            System.out.println(sb.toString().trim());
            return;
        }
        for(int i = 0; i<n;i++){
            if(visited[i]==true){
                continue;
            }
            visited[i] = true;
            list[cnt]=i+1;
            cnt++;
            dfs(i,list,cnt);
            cnt--;
            visited[i] = false;
        }
        return;
    }
}
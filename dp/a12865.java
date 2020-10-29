package dp;

import java.util.Scanner;

public class a12865 {
    static int[][] items;
    static int[][] memo;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        items = new int[n+1][2];
        memo = new int [n+1][k+1];
        for(int i =1; i < n+1;i++){
            items[i][0]=s.nextInt();
            items[i][1]=s.nextInt();
        }

        System.out.println(dp(n,k));



        
    }
        static int dp(int n, int k){
            if(memo[n][k] != 0) {
                return memo[n][k];
            }
            if(n==0||k==0){
                return 0;
            }
            if(items[n][0]>k){
                return dp(n-1,k); 
            } else{
                int tmp = dp(n-1,k);
                int tmp2 = items[n][1]+dp(n-1,k-items[n][0]);
                int max = tmp>tmp2? tmp:tmp2;
                memo[n][k] = max;
                return max;
                
            }
        }
}

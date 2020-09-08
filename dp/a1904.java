package dp;

import java.util.Scanner;
public class a1904 {
    static int[] memo;
    static boolean[] memoed;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        memo = new int[n+1];
        // memoed = new boolean[n];
        memo[0] = 1;
        memo[1] = 2;
        // memoed[0] = true;
        // memoed[1] = true;
        dp(n);
        System.out.println(memo[n-1]);
        
    }

    static int dp(int n){
        if(memo[n-1]!=0){
            return memo[n-1];
        }
        else{
            memo[n-1] = (dp(n-1)+dp(n-2))%15746;
            return memo[n-1];
        }
    }
}

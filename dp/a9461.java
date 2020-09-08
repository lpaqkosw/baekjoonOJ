package dp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class a9461 {
    static long[] memo = new long[100];
    static int[] testcase;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        testcase = new int[n];
        for(int i = 0; i < n; i++){
            testcase[i] = s.nextInt();
            
        }
        for(int i=0;i<n;i++){
            bw.write(dp(testcase[i])+"\n");
        }
        bw.close();
    }

    static long dp(int tcase){
        if(tcase == 1 || tcase==2||tcase==3){
            memo[tcase-1] = 1;
            return memo[tcase-1];
        }
        if(memo[tcase-1]!=0){
            return memo[tcase-1];
        }
        else{
            memo[tcase-1] = dp(tcase-2)+dp(tcase-3);
            return memo[tcase-1];
        }
    }
}

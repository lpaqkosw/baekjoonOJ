package dp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class a2579 {
    static int n;
    static int[] scores;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] memo;

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        scores = new int[n+1];
        memo=new int[n+1];
        for(int i = 1; i < scores.length; i++){
            scores[i] = s.nextInt();
        }
        memo[0]=0;
        memo[1]=scores[1];
        if(n > 1){
            memo[2]=scores[2]+scores[1];
        }
        dp(n);
        bw.write(memo[n]+"");
        bw.close();
    }

    static int dp(int idx){
        if(idx==0){
            return 0;
        }
        if(memo[idx]!=0){
           return memo[idx];
        } else{
           memo[idx] = Math.max(dp(idx-2)+scores[idx],dp(idx-3)+scores[idx-1]+scores[idx]);
           return memo[idx];
        }
        
    }
}

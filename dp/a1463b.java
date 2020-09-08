package dp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class a1463b {
    static int n;
    static int[] memo;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        memo = new int[n+1];
        for(int i = 2; i <= n; i++){
            memo[i] = memo[i-1]+1;
            if(i%3==0){
                memo[i]=Math.min(memo[i/3]+1,memo[i]);
            }
            if(i%2==0){
                memo[i]=Math.min(memo[i/2]+1,memo[i]);
            }
        }
        
        bw.write(memo[n]+"");
        bw.close();
    }
}



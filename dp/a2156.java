package dp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class a2156 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = s.nextInt();
        int[] scores=new int[n+1];
        int[] memo = new int[n+1];

        for(int i = 1; i < n+1;i++){
            scores[i] = s.nextInt();
        }
        memo[1] = scores[1];
        if(n>1){
            memo[2] = scores[2]+scores[1];
        }
        
        for(int i = 3; i < n+1;i++){
            memo[i]=Math.max(memo[i-3]+scores[i-1]+scores[i],Math.max(memo[i-1],memo[i-2]+scores[i]));
        }
        
        bw.write(memo[n]+"");
        bw.close();
    }
}

package dp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * a10844
 */
public class a10844 {
    static int n;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        long[][] memo = new long[n+1][10];
        long sum=0;
        for(int i = 1; i < 10;i++){
            memo[1][i]=1;
        }

        for(int i = 2; i < n+1;i++){
            for(int j = 0; j < 10; j++){
                if(j == 0){
                    memo[i][j] = memo[i-1][1];
                }
                else if(j==9){
                    memo[i][j] = memo[i-1][8];
                }else{
                    memo[i][j] = (memo[i-1][j-1]+memo[i-1][j+1])%1000000000;
                }
            }
        }

        for(int i = 0; i < 10;i++){
            // sum+=memo[n][i]%1000000000;
            sum=(sum+memo[n][i])%1000000000;
        }
        bw.write(sum+"");
        bw.close();
    }
    
}
package dp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class a11053 {
    static int n;
    static int[] A = new int[1001];
    static int[] memo = new int[1001];
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        
        for(int i = 1; i < n+1 ;i++){
            A[i] = s.nextInt();
        }

        memo[1]=1;
        int max = 1;
        for(int i = 2;i < n+1;i++){
            int tmp=0;
            for(int j = 1; j < i; j++){
                
                if(A[j]<A[i]){
                    if(memo[j] > tmp){
                        tmp = memo[j];
                    }
                }
            }
            memo[i] = tmp+1;
            if(memo[i]>max){
                max = memo[i];
            }
        }
        
        bw.write(max+"");
        bw.close();
    }
}

package dp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class a11053re {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] num = new int[n+1];
        int[] memo = new int[n+1];
        int max = 0;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 1; i < n+1;i++){
            num[i]=s.nextInt();
            for(int j =0; j < i; j++){
                if(num[j]<num[i]){
                    memo[i]=memo[j]>memo[i]? memo[j]:memo[i];
                }
            }
            memo[i]++;
            max = memo[i]>max? memo[i]:max;
        }
        bw.write(max+"");
        bw.close();
       
    }
}

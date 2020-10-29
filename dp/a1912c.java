package dp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class a1912c {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum+= s.nextInt();
            if(sum>max){
                max = sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        bw.write(max+"");
        bw.close();
    }
}

 

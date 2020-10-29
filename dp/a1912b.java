package dp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class a1912b {
    static int[] num;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        num = new int[n];
        int first = s.nextInt();
        int max = first;
        int sum = first;
        for(int i = 1; i < n; i++){
            num[i]=s.nextInt();
            sum = Math.max(num[i],sum+num[i]);
            max = sum>max? sum:max;
        }
        bw.write(max+"");
        bw.close();
    }
}

 

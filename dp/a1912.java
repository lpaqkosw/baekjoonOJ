package dp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class a1912 {
    static int[] num;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        num = new int[n];
        int first = s.nextInt();
        int max = first;
        int sum = first;
        // for(int i = 1; i < n; i++){
        //     num[i]=s.nextInt();
        //     System.out.println(i+":");
        //     if(sum<sum+num[i]){
        //         sum = Math.max(sum,Math.max(sum+num[i],num[i]));
        //         max = sum>max? sum:max;
        //         System.out.println("sum: "+sum);
        //         System.out.println("max: "+max);
        //     } else{ //num[i] <0
        //         if(sum<0){
        //             sum = sum>num[i]? sum:num[i];
        //         }else{
        //             sum = num[i];
        //         }

        //     }
        // }
        for(int i = 1; i < n; i++){
            num[i]=s.nextInt();
            // System.out.println(i+":");
            sum = Math.max(num[i],sum+num[i]);
            max = sum>max? sum:max;
            // System.out.println("sum: "+sum);
            // System.out.println("max: "+max);
        }
        bw.write(max+"");
        bw.close();
    }
}

 

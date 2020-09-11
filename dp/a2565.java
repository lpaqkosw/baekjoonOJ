package dp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class a2565 {
    static int n;
    static int[] memo;
    static int[] in = new int[501];
    static int[] nums;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        nums = new int[n+1];
        memo = new int[n+1];
        for(int i = 0; i < n; i++){
            in[s.nextInt()] = s.nextInt();
        }
        int idx=1;
        for(int x : in){
            if(x!=0){
                nums[idx] = x;
                idx++;
            }
            if(idx==n+1) break;
        }
        memo[1]=1;
        int max = 1;
        for(int i=2; i < n+1;i++){
            int tmp=0;
            for(int j = 1;j<i;j++){
                if(nums[j]<nums[i]){
                    tmp = memo[j]>tmp? memo[j]:tmp;
                }
            }
            memo[i]=tmp+1;
            max = memo[i]>max? memo[i]:max;
        }

        bw.write((n-max)+"");
        bw.close();
    }
}

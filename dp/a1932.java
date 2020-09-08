package dp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class a1932 {
    static int[][] tri;
    static int n;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        tri = new int [n][n];
        
        for(int i = 0; i < n; i++){
            for(int j =0; j <= i; j++){
                int x = s.nextInt();
                if(i > 0){
                    if(j==0){
                        tri[i][j]=tri[i-1][0]+x;
                    } else if(j == i){
                        tri[i][j] = tri[i-1][j-1]+x;
                    } else{
                        tri[i][j] = Math.max(tri[i-1][j],tri[i-1][j-1])+x;
                    }
                } else{
                    tri[i][j] = x;
                }
            }
        }

        for(int i = 0; i < n;i++){
            if(tri[n-1][i] > max){
                max = tri[n-1][i];
            }
        }

        bw.write(max+"");
        bw.close();
    }
}

package dp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * a1149
 */
public class a1149 {
    static int n;
    static int[][] costs;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        costs = new int[n][3];
        for(int i = 0; i < n;i++){
            for(int j =0; j < 3;j++){
                costs[i][j] = s.nextInt();
            }
        }

        for(int i = 1; i < n;i++){
            costs[i][0] = Math.min(costs[i-1][1], costs[i-1][2])+costs[i][0];
            costs[i][1] = Math.min(costs[i-1][0], costs[i-1][2])+costs[i][1];
            costs[i][2] = Math.min(costs[i-1][1], costs[i-1][0])+costs[i][2];
        }

        bw.write(Math.min(costs[n-1][0],Math.min(costs[n-1][2],costs[n-1][1]))+"");
        bw.close();
    }
    
}
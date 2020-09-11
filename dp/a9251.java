package dp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class a9251 {
    static int memo[][];
    static String a, b;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        b = s.nextLine();
        a = s.nextLine();
        memo=new int[a.length()+1][b.length()+1];
        for(int i = 0; i < a.length()+1;i++){
            for(int j = 0; j < b.length()+1;j++){
                if(i ==0 || j == 0){
                    memo[i][j]=0;
                } else if(a.charAt(i-1)==b.charAt(j-1)){
                    memo[i][j]=memo[i-1][j-1]+1;
                }else{
                    memo[i][j]= memo[i-1][j]>memo[i][j-1]? memo[i-1][j]:memo[i][j-1];
                }
            }
        }

        bw.write(memo[a.length()][b.length()]+"");
        bw.close();

    }

    
}

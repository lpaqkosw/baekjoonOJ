package backtracking;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * a14888 연산자 끼워넣기
 */
public class a14888 {
    static int n, idx;
    static int[] numbers;
    static int[] operators = new int[4];
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        numbers = new int[n];
        for(int i = 0; i < n;i++){
            numbers[i] = s.nextInt();
        }

        for(int i = 0; i < 4; i++){
            operators[i] = s.nextInt();
        }

        dfs(1,numbers[0]);
        bw.write(max+"\n"+min);
        bw.close();

    }

    static void dfs(int idx,int add){
        int mid=0;
        
        if(idx == n){
            if(add> max ){
                max = add;
            }
            if(add < min){
                min = add;
            }
            return;
        }
        for(int i = 0; i < 4;i++){
            if(operators[i]==0){
                continue;
            }
            operators[i]--;
            switch (i) {
                case 0:
                    mid = add+numbers[idx];
                    break;
                case 1:
                    mid = add-numbers[idx];
                    break;
                case 2:
                    mid = add*numbers[idx];
                    break;
                case 3:
                    mid = add/numbers[idx];
                    break;            
            }
            idx++;
            dfs(idx,mid);
            idx--;
            operators[i]++;
            
        }
        return;
    }
}
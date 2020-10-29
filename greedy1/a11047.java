package greedy1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class a11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());
        int[] unit = new int[n];
        int cnt=0;
        for(int i = n; i > 0;i--){
            unit[i-1] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < unit.length;i++){
            if(money ==0)break;
            if(money/unit[i]>0){
                cnt += money/unit[i];
                money = money%unit[i];
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(cnt+"");
        bw.close();
        br.close();
        
    }
}

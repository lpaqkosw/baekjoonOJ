package dp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class a11054 {
    static int n;
    static int[] memoInc = new int[1001];
    static int[] memoDec = new int[1001];
    static int[] in = new int[1001];
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        n= s.nextInt();
        for(int i = 1; i < n+1;i++){
            in[i]=s.nextInt();
        }
        int max=1;
        memoInc[1] = 1;
        int incMax=1;
        memoDec[n]=1;
        int decMax=1;
        for(int i = 2;i < n+1;i++){
            int tmpInc=0;
            int tmpDec=0;
            for(int j = 1;j<i;j++){
                if(in[j]<in[i]){
                //    tmpInc = Math.max(tmpInc,memoInc[j]);
                   tmpInc = tmpInc>memoInc[j]? tmpInc:memoInc[j];
                }
            }
            for(int j = n; j > n+1-i; j--){
                if(in[j]<in[n+1-i]){
                    // tmpDec = Math.max(tmpDec,memoDec[j]);s
                    tmpDec = tmpDec>memoDec[j]? tmpDec:memoDec[j];
                }
            }
            memoInc[i]=tmpInc+1;
            if(memoInc[i]>incMax){
                incMax=memoInc[i];
            }
            memoDec[n+1-i]=tmpDec+1;
            if(memoDec[n+1-i]>decMax){
                decMax=memoDec[n+1-i];
            }
        }
        
    for(int i =1; i < n+1;i++){
        max = Math.max(memoInc[i]+memoDec[i]-1,max);
    }
    bw.write(max+"");
    bw.close();

    }
}

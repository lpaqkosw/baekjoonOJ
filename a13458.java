import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class a13458 {
    static int[] rooms;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long sum=0;
        rooms = new int[n];
        for(int i = 0; i < n; i++){
            rooms[i]=s.nextInt();
        }
        int main = s.nextInt();
        int sub = s.nextInt();
        for(int i = 0; i < n; i++){
            int tmp = rooms[i]-main;
            sum++;
            if(tmp <=0) {
                continue;
            }
            sum+=tmp/sub;
            if(tmp%sub!=0){
                sum++;
            }
        }
        bw.write(sum+"");
        bw.close();
    }
}

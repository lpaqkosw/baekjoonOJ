import java.util.Scanner;

public class a10872 {
    static int res=1;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        factorial(n);
        System.out.println(res);
    }

    static int factorial(int n){
        if(n>1){
            res*=n;
            return factorial(n-1);
        }else{
            return 0;
        }
    }
}
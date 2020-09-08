import java.util.Scanner;

/**
 * a10870 피보나치수 5
 */
public class a10870 {
    static int res;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fibo(n));

    }
    
    static int fibo(int n){
        
        if(n == 1 || n == 2){
            return 1;
        }else if(n==0){
            return 0;
        } else{
            return fibo(n-1)+fibo(n-2);
        }
    }
}
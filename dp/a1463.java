package dp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class a1463 {
    static int n;
    static Map<Integer,Integer> memo= new HashMap<Integer,Integer>();
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        memo.put(1, 0);
        memo.put(2,1);
        memo.put(3,1);
        dp(n);
        System.out.println(memo.get(n));
    }
    static int dp(int n){
        if(memo.containsKey(n)){
            return memo.get(n);
        } else{
            min = dp(n-1)+1;
            if(n%3==0){
                min = Math.min(dp(n/3)+1,min); 
            };
			if(n%2 ==0){
                min = Math.min(dp(n/2)+1,min);
            };
                memo.put(n,min);
            }
            return memo.get(n);
        }
    }



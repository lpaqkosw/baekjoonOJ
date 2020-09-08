import java.util.Scanner;

public class a2798 {
    static int n;
    static int[] cards;
    static int goal;
    static int sum;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        goal = s.nextInt();
        cards = new int[n];
        for(int i = 0; i < n;i++){
            cards[i]=s.nextInt();
        }
        dfs(0,0,0);
        System.out.println(sum);
    }

    static void dfs(int idx, int cnt, int max){
        if(max > goal){
            return;
        }
        if(cnt==3){
            sum = Math.max(max,sum);
            return;
        }
        for(int i = idx; i < n;i++){
            dfs(i+1,cnt+1,max+cards[i]);
        }
    }
}
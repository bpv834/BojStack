import java.util.Arrays;
import java.util.Scanner;

public class Boj1699 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] A = new int[n + 1];
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            A[i]=i;
        }
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1]=1;
        dp[0]=0;

        int value = 2;
        for (int i = 2; i <= n; i++) {
            if(i==Math.pow(value,2)){
                dp[i]=1;
                value++;
            }else {
                for (int j = 1; j <= Math.sqrt(i); j++) {
             /*       System.out.println("i= "+i+" j= "+j);*/
                    int pow = (int) Math.pow(j, 2);
                    int val = i - (int) Math.pow(j, 2);
                 /*   System.out.println("pow= "+pow+" val = "+val);*/
                    dp[i] = Math.min(dp[i], dp[pow] + dp[val]);
                }
            }

        }


        System.out.println(dp[n]);


    }
}

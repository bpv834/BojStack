import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Boj2156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        if(n==1) System.out.println(arr[1]);
        else if (n==2) System.out.println(arr[1]+arr[2]);
        else {

            dp[1] = arr[1];
            dp[2] = arr[1] + arr[2];
            // 6 10 13 9 8 1
           // System.out.println(Arrays.toString(dp));
            for (int i = 3; i <= n; i++) {
                dp[i] =Math.max( Math.max(dp[i-2],dp[i-3]+arr[i-1])+arr[i],dp[i-1]);
                //d3 = d i-2 +

            }
            int ans=-1;

            for (int i = 1; i <= n; i++) {
                ans = Math.max(ans, dp[i]);
            }


            System.out.println(ans);
        }

    }
}

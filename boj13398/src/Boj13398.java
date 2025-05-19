import java.util.Arrays;
import java.util.Scanner;

public class Boj13398 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[][] dp = new int[n][2]; // 0열 포함값, 1열 미포함값

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        dp[0][1]= dp[0][0] = arr[0];


        for (int i = 1; i < n; i++) {

            dp[i][0] = Math.max(dp[i-1][0] + arr[i],arr[i]);

            dp[i][1] = Math.max(dp[i-1][0],dp[i-1][1]+arr[i]);
        }

        int ans = arr[0];


        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, Math.max(dp[i][0], dp[i][1]));
        }
        System.out.println(ans);
    }
}

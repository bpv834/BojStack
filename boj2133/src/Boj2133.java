import java.util.Arrays;
import java.util.Scanner;

public class Boj2133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] dp = new long[n + 1];
        dp[0] = 1;

        for (int i = 2; i <= n; i += 2) {
            dp[i] = dp[i - 2] * 3;
            for (int j = 0; j <= i - 4; j += 2) {
                dp[i] += dp[j] * 2;
            }
        }
        if (n == 1) System.out.println(0);
        else System.out.println(dp[n]);
    }

}

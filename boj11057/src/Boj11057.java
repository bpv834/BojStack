import java.util.Scanner;

public class Boj11057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n + 1][10];

        for (int i = 0; i <= 9; i++) {
            dp[1][i]=1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= 9; j++) {

                for (int k = j; k <= 9; k++) {
                    dp[i][j] = (dp[i][j]+ dp[i-1][k])%10007;
                }
            }
        }
        int ans=0;
        for (int i = 0; i < 10; i++) {
            ans= (dp[n][i] + ans)%10007;
        }
        System.out.println(ans);
    }
}

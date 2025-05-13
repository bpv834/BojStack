import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj10844 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int mod  = 1000000000;
        int[][] dp = new int[n + 1][10];
        for (int i = 1; i <= 9; i++) {
            dp[1][i]= 1;
        }

        for (int i = 2; i <= n; i++) {
            dp[i][0]=dp[i-1][1]%mod;
            for (int j = 1; j <= 8; j++) {
                dp[i][j] = (dp[i-1][j-1]+ dp[i-1][j+1])%mod;
            }
            dp[i][9]= dp[i-1][8]%mod;
        }
        long ans = 0;
        for (int i = 0; i < 10; i++) {
            ans= (dp[n][i]+ans)%mod;
        }
        System.out.println(ans);
    }
}

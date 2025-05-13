import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj15990 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        long[][] dp = new long[100001][4];
        long mod = 1000000009;
        dp[1][1]=1;
        dp[2][2]=1;
        dp[3][1]=1;
        dp[3][2]=1;
        dp[3][3]=1;


        for (int j = 4; j < 100001; j++) {
            dp[j][1]= (dp[j-1][2]+dp[j-1][3])%mod;
            dp[j][2]= (dp[j-2][1]+dp[j-2][3])%mod;
            dp[j][3]= (dp[j-3][1]+dp[j-3][2])%mod;
        }

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            System.out.println((dp[n][1]+dp[n][2]+dp[n][3])%mod);


        }

    }
}

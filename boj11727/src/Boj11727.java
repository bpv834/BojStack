import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11727 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];
        dp[1]=1;
        dp[2]=3;

        for (int i = 3; i < dp.length; i++) {
            dp[i] = (2*(dp[i-2])+dp[i-1])%10007;
        }
        System.out.println(dp[n]);
    }
}

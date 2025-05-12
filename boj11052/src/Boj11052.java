import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj11052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer tk = new StringTokenizer(input);
        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];
        int ans = 0;

        for (int t = 0; t < n; t++) {
            arr[t + 1] = Integer.parseInt(tk.nextToken());
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.max(dp[i - j] + arr[j], dp[i]);
            }
        }
        System.out.println(dp[n]);


    }
}

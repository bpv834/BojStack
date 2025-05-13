import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj16194 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] arr = new int[t + 1];
        int[] dp = new int[t + 1];
        Arrays.fill(dp,Integer.MAX_VALUE);


        String input = br.readLine();
        StringTokenizer tk = new StringTokenizer(input);

        for (int i = 1; i <= t; i++) {
            arr[i] = Integer.parseInt(tk.nextToken());
        }
       /* System.out.println(Arrays.toString(arr));*/

        dp[1] = arr[1];
        dp[0]=0;
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j] + arr[j]);
            }
        }

        System.out.println(dp[t]);



    }
}

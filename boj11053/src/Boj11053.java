import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        String input = br.readLine();
        StringTokenizer tk = new StringTokenizer(input);

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(tk.nextToken());
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(A[i]>A[j]){
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
        }
        int ans= 0;
        for (int i = 0; i < n; i++) {
            ans=Math.max(ans,dp[i]);
        }
        System.out.println(ans);



    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] dp = new int[12];
            dp[1]=1;
            dp[2]=2;
            dp[3]=4;
            if(n==1) System.out.println(1);
            else if(n==2) System.out.println(2);
            else if(n==3) System.out.println(4);
            else{
                for (int j = 4; j <= n; j++) {
                    dp[j]=dp[j-3]+dp[j-2]+dp[j-1];
                }
                System.out.println(dp[n]);
            }

        }

    }
}
import java.util.Scanner;
import java.util.Stack;

public class Boj2225 {
    static Scanner sc = new Scanner(System.in);
    static int[][] dp;
    static int n;
    static int k;
    static int mod = 1000000000;

    public static void main(String[] args) {
        n = sc.nextInt();
        k = sc.nextInt();
        dp = new int[k + 1][n + 1];

        // 양수 1개로 나타내는 수는 1개임 0 ->1개, 9-> 1개
        for (int i = 0; i <= n; i++) {
            dp[1][i] = 1;
        }

        // 놓쳤던것
        // 0을 한자리로 표현해도 1 , 0을 2자리로 표현해도 1 0, 00 각각 1개씩이기 때문
        for (int i = 1; i <= k; i++) {
            dp[i][0] = 1;
        }


        // k 증가
        for (int i = 2; i <= k; i++) {
            // n 증가
            for (int j = 1; j <= n; j++) {

                // [k][n] = [k-1][0] + [k-1][1] + [k-1][2] + ... + [k-1][n]
                for (int l = 0; l <= j; l++) {
                    dp[i][j] = (dp[i][j] % mod + dp[i - 1][l] % mod) % mod;
                    // System.out.println(i +" "+j + " i-1= "+(i-1)+" l= "+l+" 개수= "+dp[i][j]);
                }

            }
        }
        System.out.println(dp[k][n]);


    }

    static long hyperCombination(int n, int k) {
        int mod = 1000000000;
        // 20 ,2   kHn 2개에서 20개를 중복으로 고른다 2H20
        // k+n-1Cn  21개중에 20개를 선택하는것과 같다.21C20
        //       (k+n-1)!
        //------------------
        //   r! * (n-r)!

        long num = 1;
        for (int i = 1; i <= (k + n - 1); i++) num = (num * i) % mod;
        for (int i = 1; i <= n; i++) num = (num / i) % mod;
        for (int i = 1; i <= (n + k - 1 - n); i++) num = (num / i) % mod;


        return num;
    }


}

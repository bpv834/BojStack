import java.util.Scanner;

public class Boj9465 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[][] arr = new int[2][n + 1];
            int[][] dp = new int[2][n + 1];

            // 스티커 입력
            for (int j = 0; j < 2; j++) {
                for (int k = 1; k <= n; k++) {
                    int num=sc.nextInt();
                    arr[j][k] = num;
                    if(k==1) {
                        dp[j][k] = arr[j][k];
                    }
                }
            }
           /* for (int j = 0; j < 2; j++) {
                for (int k = 0; k <= n; k++) {
                    System.out.print(arr[j][k]+" ");
                }
                System.out.println();
            }*/

                for (int k = 2; k <= n; k++) {
                    dp[0][k]=Math.max(Math.max(dp[1][k-1],dp[0][k-2]),dp[1][k-2]) + arr[0][k];
                    dp[1][k]=Math.max(Math.max(dp[0][k-1],dp[0][k-2]),dp[1][k-2]) + arr[1][k];
                }
                int ans = Math.max(dp[0][n],dp[1][n]);
            System.out.println(ans);

        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class boj17404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 1][3];
        int[][] dp = new int[n + 1][3];

        dp[0][0] = dp[0][1] = dp[0][2] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i <= n; i++) {
            if(i==n){
                dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2])+arr[i][0];
                dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2])+arr[i][1];
                dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1])+arr[i][2];
            }
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2])+arr[i][0];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2])+arr[i][1];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1])+arr[i][2];
        }
        System.out.println(dp[n][0] + " " + dp[n][1] + " " + dp[n][2]);
        int[] a = new int[3];
        ArrayList<Integer> list = new ArrayList<>();

        int na =list.getFirst();


    }
}

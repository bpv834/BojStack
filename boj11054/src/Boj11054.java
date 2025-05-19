import java.util.Arrays;
import java.util.Scanner;

public class Boj11054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] dp = new int[n];
        int[] dp2 = new int[n];
        int[] arr2 = new int[n];

        Arrays.fill(dp, 1);
        Arrays.fill(dp2, 1);


        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
            arr2[n - 1 - i] = num;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                if (arr2[i] > arr2[j]) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + 1);
                }
            }
        }
        int ans=-1;
        for (int i = 0; i < n; i++) {
            dp[i] = dp[i]+ dp2[n-i-1]-1;
            ans = Math.max(ans, dp[i]);
        }


/*
        System.out.println(Arrays.toString(dp));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(dp2));
*/


       /* System.out.println(Arrays.toString(dp));*/
        System.out.println(ans);


    }
}

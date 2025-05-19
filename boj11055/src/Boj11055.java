import java.util.Arrays;
import java.util.Scanner;

public class Boj11055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            int num=sc.nextInt();
            arr[i] = num;
        }
        dp[0]=arr[0];


        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[j]+arr[i],dp[i]);
                 /*   System.out.println(Arrays.toString(dp));
                    System.out.println("i= "+i+" j= "+j+" "+(arr[i]+dp[j])+" "+dp[i]);*/
                }else{
                    dp[i] = Math.max(arr[i],dp[i]);
                }
            }
        }
        int ans =-1;
        //System.out.println(Arrays.toString(dp));
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans,dp[i]);
        }
        System.out.println(ans);


    }
}

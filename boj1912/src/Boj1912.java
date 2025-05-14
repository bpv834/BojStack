import java.util.Arrays;
import java.util.Scanner;

public class Boj1912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n];
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            dp[i]=arr[i];
        }

        for (int i = 1; i < n; i++) {
            if(dp[i-1]>=0){
                dp[i]= dp[i-1]+arr[i];
            }else{
                dp[i]= arr[i];
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(dp[i]>max) max=dp[i];
        }
       /* System.out.println(Arrays.toString(dp));*/
        System.out.println(max);
    }
}

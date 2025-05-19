import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Boj1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int[][] dp =new int[n][n+1];


        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
            String str = br.readLine();
            StringTokenizer tk =  new StringTokenizer(str);
            list.get(i).add(0);
            while(tk.hasMoreTokens()){
                list.get(i).add(Integer.parseInt(tk.nextToken()));
            }
        }
        dp[0][1]= list.get(0).get(1);

      /*  for (int i = 0; i < n; i++) {
            for (int x : list.get(i)) {
                System.out.print(x+" ");
            }
            System.out.println();
        }*/

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < list.get(i).size(); j++) {
                dp[i][j] = Math.max(dp[i-1][j-1],dp[i-1][j])+list.get(i).get(j);
            }
        }

        int ans =-1;
        for (int i = 0; i < n+1; i++) {
            ans = Math.max(dp[n-1][i],ans);
        }
        System.out.println(ans);

    }
}

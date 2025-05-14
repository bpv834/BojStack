import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Boj14002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        ArrayList<ArrayList<Integer>> dp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            dp.add(new ArrayList<>());
        }
        dp.get(0).add(0);

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j]) {
                    if (dp.get(i).size() <= dp.get(j).size()) {
                        dp.get(i).clear();
                        dp.get(i).addAll(dp.get(j));
                    }
                }
            }
            dp.get(i).add(i);
        }
        int idx=0;
        int size=0;
        for (int i = 0; i < n; i++) {
            if (dp.get(i).size() > size) {
                size = dp.get(i).size();
                idx=i;
            }
        }
      /*  for (int i = 0; i < n; i++) {
            System.out.println(dp.get(i));
        }*/

        /*System.out.println(dp.get(idx));*/
        System.out.println(dp.get(idx).size());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dp.get(idx).size(); i++) {
            sb.append(A[dp.get(idx).get(i)] + " ");
        }
        System.out.println(sb.toString().trim());
    }
}

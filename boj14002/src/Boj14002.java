import java.util.*;

public class Boj14002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] dp = new int[n];
        int[] prev = new int[n];
        Arrays.fill(prev,-1);
        Arrays.fill(dp,1);

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = Math.max(dp[j] + 1, dp[i]);
                        prev[i] = j;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        System.out.println(Arrays.toString(prev));
        int val = -1;
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (dp[i] > val) {
                val = dp[i];
                idx = i;
            }
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(A[idx]);
        while (idx > 0) {
            int value = A[prev[idx]];
            stack.push(value);
            idx = prev[idx];
        }

    /*    System.out.println(stack);*/
        StringBuilder sb = new StringBuilder();
        System.out.println(stack.size());
        while (!stack.isEmpty()) {
            sb.append(stack.pop() + " ");
        }
        System.out.println(sb.toString().trim());

    }
}





















/*
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
      *//*  for (int i = 0; i < n; i++) {
            System.out.println(dp.get(i));
        }*//*

 *//*System.out.println(dp.get(idx));*//*
        System.out.println(dp.get(idx).size());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dp.get(idx).size(); i++) {
            sb.append(A[dp.get(idx).get(i)] + " ");
        }
        System.out.println(sb.toString().trim());*/


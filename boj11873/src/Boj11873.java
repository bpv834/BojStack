import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Boj11873 {
    static int n;
    static int m;

    static int[][] map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            n = sc.nextInt();
            m = sc.nextInt();
            // 마지막 번째를 pop 하기위해서 옆에 0을 추가함 그래야 마지막 idx 에서 그다음에 0을 만나 pop되기 때문
            int[] heights = new int[m + 1];
            int ans = 0;
            map = new int[n][m];
            if (n == 0 && m == 0) break;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (map[i][j] == 1) {
                        heights[j] += 1;
                    } else {
                        heights[j] = 0;
                    }
                }
                ans = Math.max(ans, calcArea(heights));

            }
            System.out.println(ans);


        }
    }

    static int calcArea(int[] heights) {
        int area = 0;
        Stack<Integer> stack = new Stack<>();
   /*     System.out.println(Arrays.toString(heights));*/
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
          /*      System.out.println(stack);*/
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
               /* System.out.println("pop 후 stack= "+stack);
                System.out.println("넓이= "+height * width);*/
                area = Math.max(area, height * width);

            }
            stack.push(i);


        }
        return area;

    }

}

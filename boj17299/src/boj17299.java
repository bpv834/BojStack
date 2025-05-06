import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj17299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr= new int[n];
        int[] result = new int[n];
        String str = br.readLine();
        Stack<Pos> stack = new Stack<>();
        StringTokenizer tk = new StringTokenizer(str);
        HashMap<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int num= Integer.parseInt(tk.nextToken());
            arr[i] =num;
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek().cnt < map.get(arr[i])){
                Pos pos = stack.pop();
                int idx = pos.idx;
                result[idx] = arr[i];
            }
            stack.push(new Pos(i, map.get(arr[i])));
        }

        while (!stack.isEmpty()) {
            result[stack.pop().idx] = -1;
        }

        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]+" ");
        }
        System.out.println(sb.toString().trim());



    }
    static class Pos {
        int idx;
        int cnt;

        public Pos(int idx, int cnt) {
            this.idx = idx;
            this.cnt = cnt;
        }
    }
}

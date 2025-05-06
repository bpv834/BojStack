import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr =new int[n];
        int[] ch =new int[n];
        String str = br.readLine();
        Stack<Integer> stack = new Stack<>();
        StringTokenizer tk =new StringTokenizer(str);
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tk.nextToken());
        }

        stack.add(0);

     /*   for (int i = 1; i < n; i++) {
            // 스택 사이즈가 변동되면 예상치 않게 빠지는 값이 생기는 경우가 있을 수 있어 오답
            for (int j = 0; j <= stack.size(); j++) {
                int idx = stack.pop();
                //System.out.println("idx= "+idx);
                if (arr[idx] < arr[i]) {
                    ch[idx] = arr[i];
                }else {
                    stack.push(idx);
                }
            }
            stack.add(i);
            //System.out.println(stack);
        }*/
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                int idx = stack.pop();
                ch[idx] = arr[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            ch[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            sb.append(ch[i] + " ");
        }
        System.out.println(sb.toString().trim());





    }
}

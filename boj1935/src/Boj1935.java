import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Boj1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        HashSet<Character> set = new HashSet<>();
        HashMap<Character, Double> map = new HashMap<>();
        Stack<Double> stack = new Stack<>();
        double[] arr =new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        int j=0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(!set.contains(ch)&& ch!='+'&& ch!='-'&& ch!='*'&& ch!='/'){
               // System.out.println("ch= "+ch+" j+ "+j);
                set.add(ch);
                map.put(ch,arr[j]);
                j++;
            }
        }




       // System.out.println(map);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != '+' && ch != '-' && ch != '*' && ch != '/') {
                stack.add(map.get(ch));
            } else {
                double back = stack.pop();
                double front = stack.pop();
                double result = 0;
                if (ch == '+') {
                    result = front + back;
                    stack.push(result);
                } else if (ch == '-') {
                    result = front - back;
                    stack.push(result);
                } else if (ch == '*') {
                    result = front * back;
                    stack.push(result);
                } else if (ch == '/') {
                    result = front / back;
                    stack.push(result);
                }
            }
        }
        double ans = stack.pop();
        System.out.printf("%.2f%n", ans);

    }
}

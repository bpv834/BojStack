import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj1918 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // 우선순위가 높은걸 넣으려고 할때 스택에 넣으려는것보다 낮은게 있다면 지금 넣는것과 우선순위가 같은게 있을때까지 팝을 한다
                // *을 넣기전에 스택에 +,- 는 다 팝하고 /,*가 남을때까지 반복한다
                while (!stack.isEmpty() && priority(stack.peek()) >= priority(ch)) {
                    sb.append(stack.pop());
                }
                stack.push(ch);
            } else if (ch == ')') {
                // '('가 나올때까지 스택에 담았던 연산자는 전부 팝한다
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop(); // '(' 팝 해주기

            } else if (ch == '(') {
                // '(' 는 반드시 스택에 넣는다
                stack.add(ch);

            } else {
                sb.append(ch);

            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);

    }

    static int priority(char ch) {
        if (ch == '+' || ch == '-') return 1;
        else if (ch == '*' || ch == '/') return 2;
        else return 0;
    }
}

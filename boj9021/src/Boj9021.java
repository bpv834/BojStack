import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj9021 {
    static BufferedReader br;
    static Stack<Character> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            boolean result = true;
            stack.clear();
            for (int j = 0; j < str.length(); j++) {
                if(!solution(str.charAt(j))){
                    result = false;
                    break;
                }
            }

            if (!stack.isEmpty()  || !result) {
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }

        }
    }

    static Boolean solution(char ch){
        if(ch =='('){
            stack.push('(');
        }else {
            if (!stack.isEmpty()) {
                stack.pop();
            }else{
                return false;
            }
        }
        return true;
    }
}

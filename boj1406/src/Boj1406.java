import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj1406 {
    static BufferedReader br;
    public static void main(String[] args) throws IOException {
        Stack<Character> lStack = new Stack<>();
        Stack<Character> rStack = new Stack<>();
        br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
            lStack.push(str.charAt(i));
        }


        for (int i = 0; i < n; i++) {
            String cmd = br.readLine();
            StringTokenizer tk = new StringTokenizer(cmd);
            String command = tk.nextToken();
            //System.out.println("command = "+command);

            if(command.equals("L")){
                if(!lStack.isEmpty()){
                    char ch= lStack.pop();
                    rStack.push(ch);
                }


            } else if (command.equals("D") ) {
             if(!rStack.isEmpty()){
                 char ch = rStack.pop();
                 lStack.push(ch);
             }

            } else if (command.equals("B") ) {
                if(!lStack.isEmpty()){
                    lStack.pop();
                }


            } else {
                String ch = tk.nextToken();
                lStack.push(ch.charAt(0));
            }
        }
        while (!lStack.isEmpty()){
            char ch = lStack.pop();
            rStack.push(ch);
        }

        while (!rStack.isEmpty()) {
            sb.append(rStack.pop());
        }
        System.out.println(sb);
    }
}

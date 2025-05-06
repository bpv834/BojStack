import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Boj10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Character> q = new LinkedList<>();
        String input = br.readLine();
        int ans = 0;
        char preCh = ')';

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if(ch == ')'){
                if(preCh == '('){
                    q.poll();
                    int size = q.size();
                    ans+= size;
                }else{
                    q.poll();
                    ++ans;
                }
                preCh = ch;
            }else{
                q.add(ch);
                preCh = ch;
            }

        }
        System.out.println(ans);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Boj10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n  = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            StringTokenizer tk = new StringTokenizer(str);
            String cmd = tk.nextToken();

            switch (cmd) {
                case "push_front": {
                    int val = Integer.parseInt(tk.nextToken());
                    dq.addFirst(val);
                    break;
                }
                case "push_back":{
                    int val = Integer.parseInt(tk.nextToken());
                    dq.addLast(val);
                    break;
                }
                case "pop_front":{
                    if(dq.isEmpty()) System.out.println(-1);
                    else System.out.println(dq.pollFirst());
                    break;
                }
                case "pop_back":{
                    if(dq.isEmpty()) System.out.println(-1);
                    else System.out.println(dq.pollLast());
                    break;
                }
                case "size":{
                    System.out.println(dq.size());
                    break;
                }
                case "empty":{
                    if(dq.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                }
                case "front":{
                    if(dq.isEmpty()) System.out.println(-1);
                    else System.out.println(dq.getFirst());
                    break;
                }
                case "back":{
                    if(dq.isEmpty()) System.out.println(-1);
                    else System.out.println(dq.getLast());
                    break;
                }
            }
        }
    }
}

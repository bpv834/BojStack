import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer tk = new StringTokenizer(str);
        int n = Integer.parseInt(tk.nextToken());
        int k = Integer.parseInt(tk.nextToken());
        Queue<Integer> q = new LinkedList<>();

        StringBuilder sb =new StringBuilder();
        String result = "<";
        sb.append(result);
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        for(int i=0; i<n-1;i++){
            for (int j = 0; j < k - 1; j++) {
                int pn = q.poll();
                q.add(pn);
            }
            String addStr =q.poll()+", ";
            sb.append(addStr);
        }
        sb.append(q.poll());
        sb.append(">");

        System.out.println(sb);
    }
}

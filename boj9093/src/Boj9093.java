import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj9093 {
    static BufferedReader br ;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in)) ;
        int t = Integer.parseInt(br.readLine());
        Queue<String> q = new LinkedList<>();

        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            StringTokenizer tk = new StringTokenizer(str);
            while (tk.hasMoreTokens()){
                q.add(tk.nextToken());
            }

            StringBuilder ans = new StringBuilder();
            while (!q.isEmpty()){
                String token = q.poll();
                for (int j = token.length()-1; j >= 0; j--) {
                    ans.append(token.charAt(j));
                }
                ans.append(" ");
            }


            System.out.println(ans.toString().trim());


        }

    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Boj17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Queue<String> q = new LinkedList<>();
        boolean isTag = false;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == ' ') {
                if(isTag){
                    sb.append(" ");
                }else{
                    q.add(sb.toString());
                    // 버퍼를 비운다
                    sb.delete(0,sb.length());
                    q.add(" ");

                }

            } else if (ch =='<') {
                if(sb.length()>0){
                    q.add(sb.toString());
                    // 버퍼를 비운다
                    sb.delete(0,sb.length());
                    sb.append(ch);
                    isTag = true;

                }else {
                    isTag = true;
                    sb.append(ch);
                }
            } else if(ch == '>'){
                isTag = false;
                sb.append(ch);
                q.add(sb.toString());
                // 버퍼를 비운다
                sb.delete(0,sb.length());

            }else{
                 sb.append(ch);
            }
        }
        if(sb.length()>0) q.add(sb.toString());

        StringBuilder result = new StringBuilder();
        while (!q.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            String str = q.poll();
            if (str.charAt(0) == '<') {
                result.append(str);
            }else{
                sb2.append(str);
                result.append(sb2.reverse());
                sb2.delete(0, sb2.length());
            }
        }
        System.out.println(result);



    }
}

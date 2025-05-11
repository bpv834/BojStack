import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer tk = new StringTokenizer(input);
        int n = Integer.parseInt(tk.nextToken());
        int b = Integer.parseInt(tk.nextToken());
        StringBuilder sb = new StringBuilder();


        if (n == 0) System.out.println(0);
        else {
            while (true) {
                int remain =  n % b;
                n = n / b;
                if (remain > 9) {
                    char ch = (char) (remain + 55);
                    sb.insert(0, ch);
                } else {
                    sb.insert(0, remain);
                }

                if (n == 0) {
                    break;
                }
            }
            System.out.println(sb);
        }

    }
}

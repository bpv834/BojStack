import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer tk = new StringTokenizer(input);
        String bin = tk.nextToken();
        double b = Double.parseDouble(tk.nextToken());

        double num = 0;
        int idx = 0;
        for (int i = bin.length() - 1; i >= 0; i--) {

            char ch = bin.charAt(i);
            int val = 0;

            if (ch > 58) val = (ch - 55);
            else val = ch - 48;

            num += val * (Math.pow(b, idx++));
        }
        System.out.println((int)num);

    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Boj2089 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n == 0) {
            System.out.println(0);
            return;
        }

        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            int remainder = n % -2;

            if (remainder < 0) {
                remainder += 2;
                n = n / -2 + 1;
            } else {
                n = n / -2;
            }

            sb.insert(0, remainder);
        }

        System.out.println(sb);
    }
}
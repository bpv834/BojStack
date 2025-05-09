import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1373 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringBuilder sb = new StringBuilder();
        while (input.length() % 3 != 0) {
            input = "0" + input;
        }
        for (int i = 0; i < input.length()-2; i+=3) {
            String binary = input.substring(i,i+3);
            /*System.out.println("binary= "+binary);*/

            int num = Integer.parseInt(binary,2);
            sb.append(num);
        }
        System.out.println(sb);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj10820 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String str;
        while ((str = br.readLine()) != null) {
            int arr[] = new int[4];
            for (int j = 0; j < str.length(); j++) {
                int ch = str.charAt(j);
                if (ch >= 97 && ch <= 122) {
                    arr[0] = ++arr[0];
                } else if (ch >= 65 && ch <= 90) {
                    arr[1] = ++arr[1];
                } else if (ch == 32) {
                    arr[3] = ++arr[3];
                } else {
                    arr[2] = ++arr[2];
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < 4; k++) {
                sb.append(arr[k] + " ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}

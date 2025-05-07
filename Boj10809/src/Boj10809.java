import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj10809 {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[26];
        Arrays.fill(arr,-1);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            int ch = input.charAt(i);
            if (arr[ch-97] == -1) {
                arr[ch-97] = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]+" ");
        }
        System.out.println(sb.toString().trim());
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] strings = new String[input.length()];
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        for (int i = 0; i < input.length(); i++) {
            strings[i]=sb.substring(i);
        }
        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj17087 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer tk = new StringTokenizer(input);
        int n = Integer.parseInt(tk.nextToken());
        int s = Integer.parseInt(tk.nextToken());
        int[] arr = new int[n];

        StringTokenizer token = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Math.abs(s - Integer.parseInt(token.nextToken()));
        }
        for (int i = 0; i < n - 1; i++) {
            int gcd = getGcd(arr[i], arr[i + 1]);
            arr[i+1] =gcd;
        }
        System.out.println(arr[n-1]);
    }

    static int getGcd(int a, int b) {
        if(b==0) return a;

        return getGcd(b,a%b);
    }
}

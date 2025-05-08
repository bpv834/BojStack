import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer tk = new StringTokenizer(input);
        int m = Integer.parseInt(tk.nextToken());
        int n = Integer.parseInt(tk.nextToken());
        int[] prime = new int[n+1];
        Arrays.fill(prime, 1);
        prime[0] = 0;
        prime[1] = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (prime[i] == 1) {
                for (int j = i*i; j <= n; j += i) {
                    prime[j]=0;
                }
            }
        }
        for (int i = m; i <= n; i++) {
            if(prime[i]==1) System.out.println(i);
        }

    }
}

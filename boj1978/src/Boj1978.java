import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer tk = new StringTokenizer(input);
        int cnt =0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(tk.nextToken());
            if(isPrime(num)) cnt++;
        }
        System.out.println(cnt);
    }

    static boolean isPrime(int n) {
        if(n==1) return false;
        if(n==2) return true;
        for (int i = 2; i < n; i++) {
            if(n%i==0) return false;
        }
        return true;
    }
}

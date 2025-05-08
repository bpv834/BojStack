import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fac(n));

    }

    static int fac(int n) {
        if(n==0) return 1;
        if(n==1) return 1;
        int ans =1;
        for (int i = n; i > 0; i--) {
            ans = ans*i;
        }
        return ans;
    }
}

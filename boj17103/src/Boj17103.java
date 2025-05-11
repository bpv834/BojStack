import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj17103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] prime = new int[1000001];

        Arrays.fill(prime,1);
        prime[0]=0;
        prime[1]=0;

        // 소수 판별
        for (int i = 2; i <= Math.sqrt(1000000); i++) {
            if (prime[i] == 1) {
                for (int j = i * i; j <= 1000000; j += i) {
                    prime[j]=0;
                }
            }
        }


        for (int t = 0; t < n; t++) {
            int ans = 0;
            int num= Integer.parseInt(br.readLine());

            for (int i = 2; i <= num / 2; i++) {
                if (prime[i] == 1 && prime[num-i]==1) {
                   /* System.out.println("num= "+num+" 소수= "+i);*/
                    ++ans;
                }
            }
            System.out.println(ans);
        }
    }
}

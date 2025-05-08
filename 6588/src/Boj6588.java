import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Boj6588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        int[] prime = new int[1000001];
        Arrays.fill(prime, 1);
        prime[0] = 0;
        prime[1] = 0;
        // 소수 구하기
        for (int i = 0; i <= Math.sqrt(1000000); i++) {
            if (prime[i] == 1) {
                for (int j = i * i; j <= 1000000; j += i) {
                    prime[j] = 0;
                }
            }
        }

        while ((n = Integer.parseInt(br.readLine())) != 0) {


            // 구한 소수 배열을 통해 메모하며 정답 찾기
            // 홀수 소수 3부터 시작
            int front=0;
            int back =0;
            for (int i = 3; i <= n; i++) {
                // i가 소수, 홀수 일 때
                if (prime[i] == 1&& prime[i]%2!=0) {
                    int A = i;
                    int B = n-A;
                    if(prime[B]==1){
                        front=A;
                        back=B;
                        break;
                    }
                }
            }
            System.out.println(n+" = "+front+" + "+back);


        }
    }
}

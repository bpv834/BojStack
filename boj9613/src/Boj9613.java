import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj9613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            StringTokenizer tk = new StringTokenizer(input);
            int len = Integer.parseInt(tk.nextToken());

            int[] arr = new int[len];
            for (int j = 0; j < len; j++) {
                arr[j] = Integer.parseInt(tk.nextToken());
            }

            // 최악의 n이 100 이고 값이 100만인경우 100C2 는 4950쌍이며 최악의 경우 100만으로 가득차있어 최대공약수가 모두 100만이라면 4950*100만은 49억이 넘음 따라서 long
            long sum = 0;
            for (int j = 0; j < len ; j++) {
                for (int k = j + 1; k < len; k++) {
                    sum+=getGcd(arr[j],arr[k]);
                }
            }
            System.out.println(sum);

        }
    }

    static int getGcd(int a, int b) {
        if(b==0) return a;

        return getGcd(b,a%b);
    }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            String input = br.readLine();
            StringTokenizer tk = new StringTokenizer(input);
            int n = Integer.parseInt(tk.nextToken());
            int m = Integer.parseInt(tk.nextToken());
            int tmp =0;
            // 최대공약수
            int commonMax=0;
            if (m > n) {
                tmp = n;
                n=m;
                m=tmp;
            }
            int small = m;
            while (small > 0) {

                if (n % small == 0 && m % small == 0) {
                    commonMax = small;
                    break;
                }else {
                    --small;
                }
            }
            int a=n/commonMax;
            int b=m/commonMax;

            /*System.out.println(commonMax);*/
            System.out.println(commonMax*a*b);
        }
    }
}

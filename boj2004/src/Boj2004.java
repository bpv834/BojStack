import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer tk = new StringTokenizer(input);
        int n = Integer.parseInt(tk.nextToken());
        int m = Integer.parseInt(tk.nextToken());

        int tCnt = 0; // 2의 개수
        int fCnt = 0; // 5의 개수

        // nCm 조합 공식 =   n! / m! * (n-m)!

        // 분자에서 2,5의 개수
        for (long i = 2; i <= n; i *= 2) tCnt+= (int) (n/i);
        for (long i = 2; i <= m; i *= 2) tCnt-= (int) (m/i);
        for (long i = 2; i <= n-m; i *= 2) tCnt-= (int) ((n-m)/i);


        for (long i = 5; i <= n; i *= 5) fCnt+= (int) (n/i);
        for (long i = 5; i <= m; i *= 5) fCnt-= (int) (m/i);
        for (long i = 5; i <= n-m; i *= 5) fCnt-= (int) ((n-m)/i);


        System.out.println(Math.min(tCnt,fCnt));


    }
}

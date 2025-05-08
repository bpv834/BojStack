import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Boj1676 {
   /* public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String factorial = String.valueOf(fac(n));
        int cnt=0;
        for (int i = factorial.length()-1; i >=0 ; i--) {
            if (factorial.charAt(i) == '0') {
                ++cnt;
            }else break;
        }
        //System.out.println(fac(n));
        System.out.println(cnt);

    }*/
   public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());

       int tCnt=0;
       int fCnt=0;
       // n!에서 0의 개수는 5가 사용된 개수, 2가 사용된 개수 중 작은값과 같다
       for(int i =2; i<=n;i*=2) tCnt+= n/i;
       for(int i =5; i<=n;i*=5) fCnt+= n/i;

       System.out.println(Math.min(tCnt,fCnt));


       int cnt=0;
   }

/*    static BigInteger fac(int n) {
        BigInteger result = BigInteger.ONE;
        if(n==0)return result;
        if(n==1) return result;
        for (int i = n; i > 0; i--) {
            result = result.multiply(BigInteger.valueOf(i));

        }
        return result;
    }*/
}

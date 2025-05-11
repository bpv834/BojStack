import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj11576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer tk1 = new StringTokenizer(input);
        int a = Integer.parseInt(tk1.nextToken());
        int b = Integer.parseInt(tk1.nextToken());
        int len = Integer.parseInt(br.readLine());
        input = br.readLine();
        tk1 = new StringTokenizer(input);
        int idx =len-1;
        int value =0;
        while (tk1.hasMoreTokens()) {
            int num = Integer.parseInt(tk1.nextToken());
            value += (int) (num* Math.pow(a,idx--));
        }
       /* System.out.println(value);*/
        if(value==0){
            System.out.println(0);
        }else{
            StringBuilder sb = new StringBuilder();
            while (value > 0) {
                sb.insert(0,value%b+" ");
                value= value/b;

            }
            System.out.println(sb.toString().trim());
        }

    }
}

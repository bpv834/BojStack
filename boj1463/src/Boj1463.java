import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] pos = new int[1000001];
        pos[3] = pos[2] = 1;

        if(n==2||n==3) System.out.println(1);
        else{
            int idx = 0;
            for (int i = 4; i <= 1000000; i++) {
                int a = 1000000;
                int b = 1000000;
                int c = pos[i - 1];

                if (i % 3 == 0) a = pos[i / 3];
                if (i % 2 == 0) b = pos[i / 2];

                pos[i] = Math.min(Math.min(a, b), c) + 1;
                /* System.out.println("i= " + i + " pos [i]= " + pos[i]);
                 */
                if (n == i) {
                    idx = i;
                    break;
                }
            }
            System.out.println(pos[idx]);
        }
    }
}

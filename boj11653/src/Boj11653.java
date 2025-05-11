import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Boj11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int prime[] = new int[10000001];
        Arrays.fill(prime,1);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 2; i <= 10000; i++) {
            if (prime[i] == 1) {
                for (int j = i * i; j <= 10000000; j += i) {
                    prime[j]=0;
                }
            }
        }
        for (int i = 2; i <= 10000000; i++) {
            if(prime[i]==1) {
                list.add(i);
             /*   System.out.println(i);*/
            }
        }

        int n = Integer.parseInt(br.readLine());
     /*   System.out.println(list.size());*/

        int idx =0;
        while (idx < list.size()) {
            int num = list.get(idx);
            if (n % num == 0) {
                n/=num;
                System.out.println(num);
                idx =0;
            }else idx++;
        }

    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj10845 {
    static BufferedReader br;
    public static void main(String[] args) throws IOException {
        Deque<Integer> dq = new LinkedList<>();

        br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            StringTokenizer tk = new StringTokenizer(str);
            String cmd = tk.nextToken();
            switch (cmd){
                case "push": {
                    int num = Integer.parseInt(tk.nextToken());
                    dq.push(num);
                    break;
                }
                case "pop" :{
                    if(!dq.isEmpty())
                    System.out.println(dq.pollLast());
                    else System.out.println("-1");
                    break;

                }
                case "size" : {
                    System.out.println(dq.size());
                    break;

                }
                case "empty" : {
                    if(dq.isEmpty()){
                        System.out.println("1");
                    }else{
                        System.out.println("0");
                    }
                    break;
                }
                case "front" : {
                    if(!dq.isEmpty()){
                        // 가장 오래된 것 ( 가장 처음에 넣은것)
                        System.out.println(dq.getLast());
                    }
                    else System.out.println(-1);
                    break;


                }
                case "back" : {
                    if(!dq.isEmpty()){
                        // 가장 최근 것 ( 가장 마지막에 넣은것)
                        System.out.println(dq.getFirst());
                    }
                    else System.out.println(-1);

                    break;

                }

            }
        }
    }

}

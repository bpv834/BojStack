import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj10828 {
    static int n;
    static String[] strArr;
    static int[] stack;
    static ArrayList<Integer> arrayList = new ArrayList<>();
    static int topPos = 0;
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        strArr = new String[n];
        for (int i = 0; i < n; i++) {
            strArr[i] = br.readLine();
        }

        for (int i = 0; i < n; i++) {
            if (strArr[i].contains("push")) {
                String str = strArr[i];
                StringTokenizer tk = new StringTokenizer(str);
                tk.nextToken();
                int n = Integer.parseInt(tk.nextToken());

                push(n);
            } else if (strArr[i].equals("pop")) {
                pop();

            } else if (strArr[i].equals("top")) {
                top();

            } else if (strArr[i].equals("size")) {
                size();

            } else if (strArr[i].equals("empty")) {

                empty();
            }
        }
    }

    static void push(int pushNum) {
        arrayList.add(pushNum);
        topPos++;
    }

    static void pop(){
        if(topPos==0) {
            System.out.println(-1);
        }
        else {
            System.out.println(arrayList.get(topPos - 1));
            arrayList.remove(topPos - 1);
            topPos--;
        }

    }

    static void top(){
        if(topPos==0) {
            System.out.println(-1);
        }
        else {
            System.out.println(arrayList.get(topPos - 1));
        }
    }

    static void size(){
        System.out.println(arrayList.size());
    }

    static void empty() {
        if(arrayList.isEmpty()) System.out.println(1);
        else {
            System.out.println(0);
        }

    }
}

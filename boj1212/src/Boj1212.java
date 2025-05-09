import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            int num = Integer.parseInt(input.substring(i, i + 1));
            //System.out.println("num= "+num);
            String binary = Integer.toBinaryString(num);
            //System.out.println("binary= "+binary);
            while (binary.length() < 3) {
                binary = "0" + binary;
            }
            sb.append(binary);
            //System.out.println("sb= "+sb);

        }
        // 001 인상황에서 인덱스 0이 0이면 삭제한다 그렇다면 그 다음에 있던 0은 인덱스 1이 아니고 0으로 되기때문에 앞에 두자리를 확인할땐 0번인덱스를 두번 확인한다.
        if (sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        if (sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        System.out.println(sb);
    }
}

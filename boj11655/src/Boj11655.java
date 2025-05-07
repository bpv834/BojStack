import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            sb.append(transCh(ch));
        }
        System.out.println(sb);


    }
    static char transCh(char ch ){
        int ascii = ch;
        char result;
        if(ascii>=97&& ascii<=122){
            // 소문자
            int idx = ch-97;
            result = (char) (((idx + 13) % 26)+97);
        } else if(ascii>=65&& ascii<=90){
            // 대문자
            int idx = ch-65;
            result = (char) (((idx + 13) % 26)+65);
        } else if (ascii == 32) {
            //공백처리
            result=(char) ch;
        }else {
            //숫자 처리
            result = (char) ch;
        }
        return result;
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static final int BULGI_SUGI_CHA = 543;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine(); //한 줄을 읽고 문자열로 반환함
        int year = Integer.parseInt(s); //입력받을 불기 년도

        System.out.println(year - BULGI_SUGI_CHA);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int cookingTime = Integer.parseInt(br.readLine());

        hour += cookingTime / 60;
        minute += cookingTime % 60;

        if (minute >= 60) {
            hour += 1;
            minute -= 60;
        }
        if (hour >= 24) {
            hour -= 24;
        }

        System.out.println(hour + " " + minute);
    }
}

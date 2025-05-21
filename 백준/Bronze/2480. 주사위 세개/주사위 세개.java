import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if (A == B && A == C && B == C) {
            System.out.println(10000 + (A * 1000));
            return;
        }
        if (A == B || A == C) {
            System.out.println(1000 + (A * 100));
            return;
        }
        if (B == C) {
            System.out.println(1000 + (B * 100));
            return;
        }
        if (A != B && A != C && B != C) {
            int max = Math.max(A, Math.max(B, C));
            System.out.println(max * 100);
            return;
        }

    }
}

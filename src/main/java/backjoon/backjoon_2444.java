package backjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_2444 {

    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            print(N, i);
        }

        for (int i = N - 1; i > 0; i--) {
            print(N, i);
        }

        System.out.println(sb.toString());
        sb.setLength(0);


    }

    private static void print(int n, int i) {
        for (int j = 0; j < n - i; j++) {
            sb.append(" ");
        }

        for (int j = 0 ; j < 2 * i - 1 ; j++) {
            sb.append("*");
        }
        sb.append("\n");
    }
}
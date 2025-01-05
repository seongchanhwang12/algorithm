package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 2675 - 문자열 반복
 * 소요시간 - 19:20
 */
public class backjoon_2675 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < R; j++) {
                    sb.append(s.charAt(i));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
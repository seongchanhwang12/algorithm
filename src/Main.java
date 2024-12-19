import java.io.*;
import java.util.*;

/**
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in));
        // 시험본 과목개수 N
        int N = Integer.parseInt(br.readLine());
        int[] scores = new int[N];

        // 현재 점수
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = -1 ;

        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, scores[i]);
        }

        double avg = 0;
        for (int score : scores) {
            avg += (double) score / max * 100;

        }

        System.out.print(avg / scores.length + " ");

    }


}
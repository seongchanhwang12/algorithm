package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 *
 * 예제
 *     *
 *    **
 *   ***
 *  ****
 * *****
 *
 * 입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 *
 * 출력
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다
 *
 *
 */
public class backjoon_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        // i = 별이 찍힐 줄의 수
        // j = 별의 개수
        // N-i 개만큼
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if(j <= N-i){
                    sb.append(" ");
                } else {
                    sb.append("*");
                }
            }
            sb.append("\n");
        }

        // 마지막줄 개행문자는 불필요하므로 제거
        sb.setLength(sb.length()-1);
        System.out.println(sb);

    }

    /**
     * 다른 풀이
     * @param args
     * @throws IOException
     */
    public static void main2(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        // i = 별이 찍힐 줄의 수
        // j = 별의 개수
        // N-i 개만큼
        for (int i = 1; i <= N; i++) {
            sb.append(" ".repeat(N-i));

            sb.append("*".repeat(i));

            sb.append("\n");
        }

        // 마지막줄 개행문자는 불필요하므로 제거
        sb.setLength(sb.length()-1);
        System.out.println(sb);

    }
}
package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_10818 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        // 최소값 구하기
        int min = 1000000;
        int max = -1000000;

        for (String s : split) {
            min = Math.min(Integer.parseInt(s), min);
            max = Math.max(Integer.parseInt(s), max);
        }

        sb.append(min).append(" ").append(max);
        System.out.println(sb);




        // 최대값 구하기


    }


}
package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class backjoon_11720 {
    public static void main(String[] args) throws IOException {
        // N개의 숫자 공백 없이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        String str = br.readLine();
        for (int i = 0; i <N; i++) {
            sum  += str.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
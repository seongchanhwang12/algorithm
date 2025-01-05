package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다.
 * 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 *
 * 소요된 시간 : 23:46
 */
public class backjoon_10809 {
    public static void main(String[] args) throws IOException {
        // N개의 숫자 공백 없이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 단어를 받는다.
        String s = br.readLine();

        // 단어에 사용된 알파뱃의 인덱스를 알아야 하므로 알파뱃 배열을 생성한다.
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (char c : alphabet) {
            // 제시된 단어 S가 해당 알파벳 문자를 가지고 있다면 해당 문자의 index를 기록하고, 없다면 -1을 기록한다.
            sb.append(s.indexOf(c)).append(" ");
        }

        System.out.println(sb);




    }
}
package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 단어 길이 재기
 */
public class backjoon_2743 {
    public static void main2(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine().length());
    }


    /**
     * next => 공백을 기준으로 데이터를 읽고 공백을 만날때 까지 입력된 텍스트 반환
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        System.out.println(new java.util.Scanner(System.in).next().length() );
    }


}
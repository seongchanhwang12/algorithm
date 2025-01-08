package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int wordCount = getWordCount(br.readLine());

        // 그룹단어의 조건
        // 같은 문자가 연속해서 나타남 O
        // 서로 다른 문자가 연속해서 나타남 O
        // 같은 문자가 단어에 떨어져서 나타남 X
        // 이전문자와 다음 문자가 같은지 확인한다.
        // 같을경우 (true) : 해당 문자가 중복된 문자인지 검사하지 않는다.
        // 다를경우 (false) : 해당 문자가 중복된 문자인지 검사한다.

        // 중복 문자가 있는지 검사하기 위한 boolean 배열을 선언한다.
        int cnt = 0;

        for (int i = 0; i < wordCount; i++) {
            if (isGroupWord(br.readLine())){
                cnt++;
            };
        }
        System.out.println(cnt);
    }
    public static boolean isGroupWord(String word) {
        boolean[] alphabet = new boolean[26];
        char prev = '0';

        for (int j = 0; j < word.length(); j++) {
            if (prev != word.charAt(j)){
                // 현재 문자가 처음 나오는 경우
                // a가 0번째 인덱스 이므로 현재 문자에서 'a'를 빼서 인덱스를 구한다.
                if(alphabet[word.charAt(j) - 'a'] == false){
                    // 다음 문자 비교를 위해 이전 문자를 초기화한다.
                    prev = word.charAt(j);
                    // 현재 문자는 이번 회차에 나왔으므로 더이상 처음 나온 문자가 아니다. true를 대입한다.
                    alphabet[prev - 'a'] = true;
                } else {
                    // 현재 문자가 처음 나온 문자가 아닌 경우 종료한다.
                    return false;
                }

            } else {
                continue;
            };

        }

        return true;

    }

    public static int getWordCount(String word){
        return Integer.parseInt(word);
    }

}
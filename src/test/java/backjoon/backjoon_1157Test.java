
import backjoon.backjoon_1157;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class backjoon_1157Test {

    @DisplayName("가장 많이 사용된 알파뱃 구하기")
    @Test
    void test() {
        // given
        backjoon_1157 bj = new backjoon_1157();
        String word = "zZa";

        // when
        // 알파뱃 개수만큼 배열을 만든다.
        int [] alphabetCounts = bj.getAlphabetCounts(word);

        // then
        Assertions.assertEquals('Z', bj.findMostUsedAlphabet(alphabetCounts));
    }

    // 입력받은 알파뱃을 카운트
    private int[] getAlphabetCounts(String word) {
        int [] alphabetCounts = new int[91];
        for (int i = 0; i < word.length(); i++) {
            int alphabet = word.toUpperCase().charAt(i);
            alphabetCounts[alphabet]++;
        }
        return alphabetCounts;
    }

    // 가장 많이 사용된 알파뱃을 구한다.
    private char findMostUsedAlphabet(int[] alphabetCounts) {
        int beforeCnt = 0;
        char curAlphabet = 0;

        for (int i = 65; i < alphabetCounts.length; i++) {
            if(beforeCnt < alphabetCounts[i]){
                beforeCnt = alphabetCounts[i];
                curAlphabet = (char) i;
            } else if(beforeCnt == alphabetCounts[i]){
                curAlphabet = '?';
            }
        }

        return curAlphabet;
    }

}

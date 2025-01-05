package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();
        int[] alphabetCounts = getAlphabetCounts(word);
        char mostUsedAlphabet = findMostUsedAlphabet(alphabetCounts);
        System.out.println(mostUsedAlphabet);
    }

    public static int[] getAlphabetCounts(String word) {
        int [] alphabetCounts = new int[26];
        for (int i = 0; i < word.length(); i++) {
            int alphabet = word.charAt(i);
            alphabetCounts[alphabet-65]++;
        }
        return alphabetCounts;
    }

    public static char findMostUsedAlphabet(int[] alphabetCounts) {
        int beforeCnt = 0;
        char curAlphabet = 0;

        for (int i = 0; i < alphabetCounts.length; i++) {
            if(beforeCnt < alphabetCounts[i]){
                beforeCnt = alphabetCounts[i];
                curAlphabet = (char) (i + 65);
            } else if(beforeCnt == alphabetCounts[i]){
                curAlphabet = '?';
            }
        }

        return curAlphabet;
    }
}

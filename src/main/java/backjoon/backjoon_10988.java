package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_10988 {

    /**
     * 풀이 1
     * @param args
     * @throws IOException
     */
    public static void main2(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        sb.append(str).reverse();

        if(str.equals(sb.toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    /**
     * 풀이 2
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        boolean isPalindrome = true;

        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

}
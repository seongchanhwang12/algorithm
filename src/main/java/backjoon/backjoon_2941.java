package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_2941 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if(ch == 'c'){
                if( i < word.length()-1 && word.charAt( i + 1 ) == '='){
                    i++;
                } else if( i < word.length()-1 && word.charAt( i + 1) == '-'){
                    i++;
                }
            }

            else if(ch == 'n'){
                if( i < word.length()-1 && word.charAt( i + 1 ) == 'j'){
                    i ++;
                }
            }

            else if(ch == 'l'){
                if( i < word.length()-1 && word.charAt( i + 1 ) == 'j'){
                    i++;
                }
            }

            else if(ch == 's'){
                if( i < word.length() -1 && word.charAt( i + 1 ) == '='){
                    i++;
                }
            }

            else if(ch == 'z'){
                if( i < word.length() -1 && word.charAt( i + 1 ) == '='){
                    i++;
                }
            }

            else if(ch == 'd') {
                if (i< word.length() -1 && word.charAt(i + 1) == 'z') {
                    if ((i < word.length() - 2 ) && (word.charAt(i + 2) == '=')) {
                        i += 2;
                    }
                }

                if ( i < word.length()-1 && word.charAt(i + 1) == '-') {
                    i++;
                }
            }
            count ++;
        }

        System.out.println(count);

    }

}
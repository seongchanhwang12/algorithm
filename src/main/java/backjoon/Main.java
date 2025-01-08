import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 몇개의 크로아티아 알파뱃으로 이루어져있는지 출력


        // 목록에 없는 알파뱃은 한 글짜씩 센다.


        // 몇자로 이루어져있는가?
        // nj, lj, s= , z= d- dz= c- c=
        // njljs= : 3글자
        // 크로아티아 알파뱃을 세는 방법
        // 단어를 입력받는다.

        // String word = br.readLine();
        String word = "njssljs=";
        System.out.println(word.indexOf("nj"));

        // word에 크로아티아 알파뱃이 있는지 확인한다.

        // 1. 크로아티아 알파뱃이 어디엔가 저장되어어 있어야한다.
        // 2. 저장된 알파뱃을 가지고 단어에 포함되어있는지 찾는다.
        //
        String[] croatianAlphabet = {"nj", "lj","s=", "z=", "d-", "dz", "c-","c="};

        for (int i = 0; i < word.length(); i++) {
             int index = word.indexOf(croatianAlphabet[i]);
             if(index != -1) {

             }

        }


    }

}
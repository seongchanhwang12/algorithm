package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_11718 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        String s = "";
        while ((s = br.readLine()) != null ){
            sb.append(s).append("\n");
        }
        // 입력한 글자 그대로 출력
        System.out.println(sb);
    }
    public static void ascii(String[] args) throws IOException {

        // 아스키 = 문자와 숫자를 매핑하는 표준 코드
        // read()는 입력된 문자를 아스키 코드값으로 변환해 반환
        // read()는 바이트 단위로 문자를 처리
        // 사용자가 키보드로 문자 입력 -> 컴퓨터 : 문자를 바이트 값(아스키 값) 으로 변환해 전달
        // 바이트 : 0~255의 값을 가짐
        // A 입력(바이트) => 01000001(2진수) 메모리에 저장=> read(): 65로 변환(10진수) =>
        // char는 unicode를 이용해 문자를 표현. 65를 유니코드 값으로 변환해야함.
        // 65 => 01000001 => A
        // ASCII는 unicode의 하위 집합. 유니코드에서 아스키 값을 동일한 문자로 매핑
        // ASCII 값을 char로 변환 -> 유니코드표에서 해당 값에 대항하는 문자 반환


        byte [] buffer = new byte[8094];
        int data;
        // 읽은 바이트의 수를 반환
        while((data = System.in.read(buffer))>0 ){
            System.out.println(data);
            System.out.write(buffer,0,data );
        }


    }

}
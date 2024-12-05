package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 오늘은 혜아의 면접 날이다. 면접 준비를 열심히 해서 앞선 질문들을 잘 대답한 혜아는 이제 마지막으로 칠판에 직접 코딩하는 문제를 받았다. 혜아가 받은 문제는 두 수를 더하는 문제였다. C++ 책을 열심히 읽었던 혜아는 간단히 두 수를 더하는 코드를 칠판에 적었다. 코드를 본 면접관은 다음 질문을 했다. “만약, 입출력이
 $N$바이트 크기의 정수라면 프로그램을 어떻게 구현해야 할까요?”

 혜아는 책에 있는 정수 자료형과 관련된 내용을 기억해 냈다. 책에는 long int는
 $4$바이트 정수까지 저장할 수 있는 정수 자료형이고 long long int는
 $8$바이트 정수까지 저장할 수 있는 정수 자료형이라고 적혀 있었다. 혜아는 이런 생각이 들었다. “int 앞에 long을 하나씩 더 붙일 때마다
 $4$바이트씩 저장할 수 있는 공간이 늘어나는 걸까? 분명 long long long int는
 $12$바이트, long long long long int는
 $16$바이트까지 저장할 수 있는 정수 자료형일 거야!” 그렇게 혜아는 당황하는 면접관의 얼굴을 뒤로한 채 칠판에 정수 자료형을 써 내려가기 시작했다.

 혜아가
 $N$바이트 정수까지 저장할 수 있다고 생각해서 칠판에 쓴 정수 자료형의 이름은 무엇일까?

 */
public class backjoon_25314 {
    public static void main(String[] args) throws IOException {

        /**
         * Scanner vs BufferedReader
         * Scanner는 내부적으로 입력을 토큰화하고 정규식을 사용해 자료형을 확인하고 변환한다.
         * 내부적으로 정규식 매칭과 토큰화를 위한 버퍼를 추가 생성해 메모리 사용량이 높다.
         * BufferedReader
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /**
         * Inetger.valueOf vs Integer.parseInt
         * valueOf의 반환타입은 Integer, parseInt의 반환타입은 int 타입이다.
         * valueOf는 문자열을 숫자열로 변환한 후 객체 캐싱을 한다.
         * 객체 캐싱이란  -128~127 까지의 정수일 경우 캐싱해 재사용 하는 것을 말한다.
         * 이 범위의 값은 추가 객체를 생성하지 않고 캐싱된 객체를 반환하기 때문에 재사용해야 하는 경우 효율적이다.
         * Integer를 캐싱한다.(Integer로 wrapping 시 오버헤드 발생)
         * 숫자 변환 시 내부적으로 parseInt를 호출하기 때문에 단순 숫자 값 변환이 필요할 경우
         * 추가 객체를 생성하지 않는 parseInt가 효율적이다.
         * parseInt는 내부적으로 char 배열을 읽어 정수로 변환하여 반환한다.
         */
        int N = Integer.parseInt(br.readLine())/4;

        while(N-- > 0) {
            sb.append("long ");
        }

        sb.append("int");
        System.out.println(sb);
    }
}
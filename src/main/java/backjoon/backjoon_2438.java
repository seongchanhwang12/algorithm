package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /**
         * StringBuilder vs BufferedWriter
         * 두 방식 모두 사용해 본 결과 StringBuilder가 훨씬 효율적이었다.(메모리, 실행시간 측면)
         *
         * BufferedWriter
         * 데이터 작성시 버퍼에 즉시 데이터를 추가. 즉 write() 시마다 문자열이 출력 버퍼로 전달됨.
         * 작은 단위로 반복적으로 데이터를 전달할 경우 오버헤드가 발생.
         * 이유는 bw.write()가 반복적으로 호출되면 각각의 출력이 출력 버퍼와의 통신을 유발해 오버헤드가 증가.
         * 따라서 반복적인 호출에는 비효율적이다.
         *
         * StringBuilder
         * 데이터를 메모리상의 내부 배열에 임시로 저장.
         * 즉, 데이터를 메모리 내에서 조작하므로 CPU연산만 필요하며 상대적으로 속도가 훨씬 빠르다.
         * 데이터를 출력할 때 toString()으로 한꺼번에 데이터가 전달되므로 I/O에  대한 오버헤드가 적어 속도가 훨씬 빠르다.
         *
         */
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }

            if(i != N){
                sb.append("\n");
            }
        }

        /**
         * BufferedWriter vs println
         * 적은 양의 데이터를 출력할 때 println 이 더 효울적(가독성 측면)이라는 결론이 나왔다.
         *
         * BufferedWriter의 주된 성능 이점은 buffer에 데이터를 담아 I/O 횟수를 줄이는 것.
         * I/O는 매우 비싼작업이기 때문.
         * Java의 표준 출력 (System.out)은 효율적으로 처리하기 위해 최적화 되어있다.
         * 특히 작은 크기의 데이터는 이러한 최적화로 인해 성능 차이가 거의 없음.
         *
         * prtinln은 내부적으로 PrintStream을 사용하며, PrintStream 역시 내부적으로 소량의 버퍼를 이용해 큰 차이가 없다.
         * 단 출력 데이터가 많을 경우 pritln은 I/O 호출 횟수가 많아져 성능이 저하된다.
         *
         */
        System.out.println(sb);



    }
}
package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.Stream;

public class backjoon_9086 {

    /**
     * 9086 - 문자열 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- >0){
            String s = br.readLine();
            System.out.print(s.charAt(0));
            System.out.println(s.charAt(s.length() - 1));
        }
    }


    /**
     * Stream을 사용한 풀이
     * @param args
     * @throws IOException
     */
    public static void useStream(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // 개행문자 처리

        // generate : 무한 스트림 반환. Supplier로 정의된 로직에 따라 요소를 생성.
        // supplier : 각 스트림을 생성하는 함수. 값을 하나씩 생성하는 기능을 담당하는 함수. 새로운 값을 계속해서 반환해야한다.
        // Stream.limit(maxSize) : 스트림에서 최대 maxSize 만큼의 요소를 가져오도록 제한하는 메소드. 제한된 크기의 스트림 반환.
        Stream.generate(sc::nextLine)
                .limit(t)
                .forEach(s -> System.out.println(s.charAt(0) + "" + s.charAt(s.length()-1)));
    }


    public static void supplierTest(String[] args) throws IOException {
        Stream<Integer> generate = Stream.generate(() -> (int) (Math.random() * 100)); // (int)로 캐스팅된 Math.random은 항상 0으로 내림되니 주의
        generate.limit(5).forEach(System.out::println); // 무한 스트림을 제한하여 5개의 요소만 출력
    }
}
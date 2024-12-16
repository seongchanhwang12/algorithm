package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 문제
 * 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
 *
 * 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
 *
 * 출력
 * 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
 */
public class backjoon_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in));

        // 서로 다른 나머지가 몇 개인지 출력 = 나머지가 서로 다른 수를 중복 없이 카운트 해야하므로 중복 없이 데이터를 저장하는 Set을 이용한다.
        Set<Integer> s = new HashSet<>();

        int count = 10;
        while (count-- >0){
            s.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.println(s.size());
    }

    public static void useMap(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in));
        Map<Integer,Integer> map = new HashMap<>();

        int count = 10;
        while (count-- >0){
            int N = Integer.parseInt(br.readLine())%42;
            // 사실 Map도 중복을 허용하지 않으므로 +1은 필요없다.
            map.put(N, map.getOrDefault(N, 0) + 1 );

        }

        System.out.println(map.size());
    }



}
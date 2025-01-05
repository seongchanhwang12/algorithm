package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_2908 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] split = br.readLine().split(" ");
        int a = Integer.parseInt(sb.append(split[0]).reverse().toString());
        sb.setLength(0);
        int b = Integer.parseInt(sb.append(split[1]).reverse().toString());

        System.out.println(Math.max(a,b));
    }
}
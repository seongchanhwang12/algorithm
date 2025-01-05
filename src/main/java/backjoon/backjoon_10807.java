package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class backjoon_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String [] numbers = br.readLine().split(" ");

        String V = br.readLine();

        int cnt = 0;

        while (N-1 >= 0) {
            if (numbers[N-1].equals(V)) cnt++;
            N--;
        }

        System.out.println(cnt);

        br.close();

    }

}
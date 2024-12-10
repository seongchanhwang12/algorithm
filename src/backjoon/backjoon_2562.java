package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class backjoon_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            list.add(n);
            max = Math.max(max,n);
        }

        System.out.println(max);
        System.out.println(list.indexOf(max)+1);

    }


    public static void main2(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] numbers = new int[9];

        int maxIdx = -1;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 9; i++) {
            numbers[i] = Integer.parseInt( br.readLine());

            if(numbers[i]>max){
                maxIdx = i;
                max = numbers[i];
            }
        }
        sb.append(max).append("\n").append(maxIdx+1);

        System.out.println(sb);

    }


}
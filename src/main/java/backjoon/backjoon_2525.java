package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        int hour = Integer.parseInt(s[0]);
        int minute = Integer.parseInt(s[1]);
        int cookingTime = Integer.parseInt(br.readLine());
        // 시
        int totalMinute = minute + cookingTime;

        if(totalMinute > 59){
            int elapsedHour = totalMinute / 60;
            int elapsedMinute = (minute + cookingTime) % 60;
            elapsedHour+=hour;

            if (elapsedHour >= 24){
                elapsedHour -= 24;
            }
            sb.append(elapsedHour).append(" ").append(elapsedMinute);
        } else {
            sb.append(hour).append(" ").append(totalMinute);
        }

        System.out.println(sb.toString());


    }
}
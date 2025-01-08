package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class backjoon_25206 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 0. 과목별 전공평점 입력받기
        // 1) 공백 을 기준으로 문자를 자른다.
        // 2) 과목평점표 Map에서 등급으로 과목 평점을 조회한다.
        // 3) 조회한 과목 (평점 * 학접) 계산 하고, sum 변수에 누적한다.
        // 4) 학접을 score 변수에 누적한다.

        // 5) 계산이 끝나면 sum을 학점의 총합 score 으로 나눈다.
        // 6) P에 대한 처리 - P가 나올경우 계산을 건너 뛴다. continue

        double sum = 0, scoreSum = 0;
        for (int i = 0; i < 20; i++) {
            String subject = br.readLine();
            StringTokenizer st = new StringTokenizer(subject);

            st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if(grade.equals("P")){
                continue;
            }


            sum += (subjectScore(grade) * score);
            scoreSum += score;
        }

        System.out.println(sum/scoreSum);
    }

    public static double subjectScore(String grade) {
        double subjectScore = 0 ;
        switch (grade) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;

            case "B+":
                return 3.5;

            case "B0":
                return 3.0;

            case "C+":
                return 2.5;

            case "C0":
                return 2.0;

            case "D+":
                return 1.5;

            case "D0":
                return 1.0;

            case "F":
                return 0;
            default:
                break;
        }
        return 0.0;
    }


}
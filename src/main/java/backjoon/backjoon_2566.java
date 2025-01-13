package backjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class backjoon_2566 {

    public static void main(String[] args) throws IOException {
        // 최댓값, 몇행 몇 열
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        // 출력을 잘 분석하면 필요한 값과 변수들을 알 수 있다.
        // 1. 첫째줄에 최댓값 출력 : 필요한 변수 최댓값
        // 2. 둘째 줄에 최댓값이 위치한 행번호와 열번호를 빈칸을 사이에두고 차례로 출력 : 행번호, 열번호
        // 3. 입력 : grid를 담을 2차원 배열

        int max = 0;
        int col = 0 ,row = 0;
        int [][] grid = new int[9][9];

        // 풀이
        // 1. 그리드를 초기화한다.
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                grid[i][j] = Integer. parseInt(st.nextToken());
            }
        }

        // 2. 순회하며 그리드의 최댓값과 가로 세로 인덱스를 구한다.
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] > max) {
                    max = grid[i][j];
                    row = i + 1;
                    col = j + 1;
                }
            }
        }

        // 3. 경우의 수를 구한다.
        // 최대값이 0인경우
        if(max==0){
            System.out.println(0);
            System.out.println(1 + " " + 1);
        } else {
            System.out.println(max);
            System.out.println(row + " " + col);
        }

    }
}
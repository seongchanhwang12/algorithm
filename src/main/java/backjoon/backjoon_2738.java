package backjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_2738 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        String[] size = br.readLine().split(" ");
        int row = Integer.parseInt(size[0]);
        int col = Integer.parseInt(size[1]);

        String[][] matrixA, matrixB;
        matrixA = createMatrix(row, col, br);
        matrixB = createMatrix(row, col, br);

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                sb.append(Integer.parseInt(matrixA[r][c]) + Integer.parseInt(matrixB[r][c])).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static String [][] createMatrix(int row, int col, BufferedReader br ) throws IOException {
        String [][] result = new String [row][col];
        for (int i = 0; i < row; i++) {
            result[i] = br.readLine().split(" ");
        }
        return result;
    }
}
package backjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_10798 {

    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] board = new char[5][15];

        System.out.println("board length: " + board.length);

        int max = 0;
        for (int i = 0; i < 5; i++) {
            String text = br.readLine();
            if( max < text.length()) max = text.length();

            for (int j = 0; j < text.length(); j++) {
                board[i][j] = text.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if(board[j][i] == 0 ) continue;
                sb.append(board[j][i]);
            }
        }

        System.out.println(sb);

    }

}
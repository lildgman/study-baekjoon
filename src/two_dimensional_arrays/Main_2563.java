package two_dimensional_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2563 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        int[][] white = new int[101][101];
        int count = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int row = Integer.parseInt(st.nextToken());
            int column = Integer.parseInt(st.nextToken());

            for (int r = row; r < row + 10; r++) {
                for (int c = column; c < column + 10; c++) {
                    if (white[r][c] != 1) {
                        white[r][c] = 1;
                        count++;
                    }

                }
            }
        }
        System.out.println(count);

    }
}

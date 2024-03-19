package solved.two_dimensional_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String[][] strArr2D = new String[5][15];

        for (String[] strings : strArr2D) {
            Arrays.fill(strings," ");
        }


        for (int i = 0; i < strArr2D.length; i++) {
            String str = br.readLine();
            for (int j = 0; j < strArr2D[i].length; j++) {
                if (j<str.length()) {
                    strArr2D[i][j] = str.split("")[j];
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (!strArr2D[j][i].equals(" ")) {
                    sb.append(strArr2D[j][i]);
                }

            }
        }

        System.out.println(sb);
    }
}

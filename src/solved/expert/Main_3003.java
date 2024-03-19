package solved.expert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_3003 {
    public static void main(String[] args) throws IOException {
        // 1 1 2 2 2 8
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int[] chessPiece = {1, 1, 2, 2, 2, 8};
        int[] haveChessPiece = new int[st.countTokens()];

        for (int i = 0; i < haveChessPiece.length; i++) {
            haveChessPiece[i] = Integer.parseInt(st.nextToken());
            System.out.print((chessPiece[i] - haveChessPiece[i]) + " ");
        }

    }
}

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_5622 {
    public static void main(String[] args) throws IOException {

        String[][] phone = {
                {"A", "B", "C"},
                {"D", "E", "F"},
                {"G", "H", "I"},
                {"J", "K", "L"},
                {"M", "N", "O"},
                {"P", "Q", "R", "S"},
                {"T", "U", "V"},
                {"W","X","Y","Z"}
        };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char[] chArr = str.toCharArray();

        int result = 0;

        for (int i = 0; i < phone.length; i++) {
            for (int j = 0; j < phone[i].length; j++) {
                for (int k = 0; k < chArr.length; k++) {
                    if (String.valueOf(chArr[k]).equals(phone[i][j])) {
                        result += i+3;
                    }
                }
            }
        }

        System.out.println(result);

    }
}

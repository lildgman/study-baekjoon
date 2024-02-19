package expert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1316_MyCode {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean[] exist = new boolean[26]; // 알파벳이 존재하는지
        int count = 0;

        int prevChar = 0;
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            exist = new boolean[26]; // 알파벳이 존재하는지
            boolean isGroupWord = true;

            for (int j = 0; j < str.length(); j++) {
                int nowChar = str.charAt(j) - 'a';

                if (prevChar != nowChar) {
                    if (!exist[nowChar - 'a']) {
                        exist[nowChar - 'a'] = true;
                        prevChar = nowChar;
                        isGroupWord = true;
                    } else {
                        break;
                    }
                }
            }
            if (isGroupWord) {
                count++;
            }

        }
    }
}

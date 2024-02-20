package expert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1316_Ref {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = n; // 단어의 개수

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            boolean[] exist = new boolean[26];

            for (int j = 0; j < str.length(); j++) {
                if (exist[str.charAt(j) - 'a'] == false) {
                    exist[str.charAt(j) - 'a'] = true;
                } else if (j>0) {
                    if (str.charAt(j) != str.charAt(j - 1)) {
                        count--;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}

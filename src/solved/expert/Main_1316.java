package solved.expert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (check()) {
                count++;
            }
        }
        System.out.println(count);

    }

    public static boolean check() throws IOException {
        boolean[] check = new boolean[26];
        int prev = 0; // 이전 문자
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            if (prev != str.charAt(i)) { // 이전 문자가 i번째 문자와 같지 않으면

                if (!check[str.charAt(i) - 'a']) { // 그 문자가 처음 나오면
                    check[str.charAt(i) - 'a'] = true;
                    prev = str.charAt(i);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}

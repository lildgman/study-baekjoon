package expert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        String str = "";
        for (int i = 0; i < n; i++) {
            str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                if (j < str.length() - 1) {
                    if (str.charAt(j) == str.charAt(j + 1)) {

                        count++;
                    }
                }
            }
        }
    }
}

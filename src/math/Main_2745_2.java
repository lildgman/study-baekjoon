package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2745_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");
        String num = st.nextToken();
        int jinsu = Integer.parseInt(st.nextToken());

        int strToNum = 0;
        int result = 0;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                strToNum = c - 55;
            } else {
                strToNum = Integer.parseInt(String.valueOf(c));
            }
          result += strToNum*((int)Math.pow(jinsu, num.length()-(i+1)));

        }

        System.out.println(result);

    }
}

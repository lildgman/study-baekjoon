package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2675 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        String str = "";

        for (int i = 0; i < t; i++) {
            str = br.readLine();
            st = new StringTokenizer(str, " ");

            int r = 0;
            String s = "";
            while (st.hasMoreTokens()) {
                r = Integer.parseInt(st.nextToken());
                s = st.nextToken();
            }

            for (int j = 0; j < s.length(); j++) {
                for (int x = 0; x < r; x++) {
                    sb.append(s.charAt(j));
                }
            }
            sb.append("\n");

        }

        System.out.println(sb);
    }
}

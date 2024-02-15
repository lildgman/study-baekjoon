package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str1 = br.readLine();
        st = new StringTokenizer(str1, " ");
        int n = 0;
        int m = 0;

        while (st.hasMoreTokens()) {
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
        }

        int i = 0;
        int j = 0;
        int k = 0;

        int[] basket = new int[n];

        for (int l = 0; l < m; l++) {
            String str2 = br.readLine();
            st = new StringTokenizer(str2, " ");

            while (st.hasMoreTokens()) {
                i = Integer.parseInt(st.nextToken());
                j = Integer.parseInt(st.nextToken());
                k = Integer.parseInt(st.nextToken());
            }

            for (int x = i - 1; x <= j - 1; x++) {
                basket[x] = k;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : basket) {
            sb.append(num);
            sb.append(" ");
        }
        System.out.print(sb);
    }
}

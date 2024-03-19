package solved.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10811 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int n = 0;
        int m = 0;

        while (st.hasMoreTokens()) {
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
        }

        int[] basket = new int[n];
        for (int i = 0; i < n; i++) {
            basket[i] = i+1;
        }

        int a = 0; // 시작
        int b = 0; // 끝

        for (int i = 0; i < m; i++) {
            str = br.readLine();
            st = new StringTokenizer(str, " ");

            while (st.hasMoreTokens()) {
                a = Integer.parseInt(st.nextToken()) - 1;
                b = Integer.parseInt(st.nextToken()) - 1;
            }

            while (a < b) {
                int tmp = basket[a];
                basket[a] = basket[b];
                basket[b] = tmp;
                a++;
                b--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : basket) {
            sb.append(num + " ");
        }
        System.out.println(sb);
    }
}

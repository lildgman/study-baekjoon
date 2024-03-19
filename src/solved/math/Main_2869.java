package solved.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken()); // 올라가는 거리
        int b = Integer.parseInt(st.nextToken()); // 떨어지는 거리
        int v = Integer.parseInt(st.nextToken()); // 나무 높이

        int target = 0;
        int count = 0;

        while (true) {
            count++;
            target += a;
            if (target < v) {
                target -= b;

            } else {
                System.out.println(count);
                break;
            }
        }

    }
}

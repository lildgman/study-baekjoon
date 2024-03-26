package unsolved.math;

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

        int day = (v-b) / (a-b); // 걸리는 일 수

        if ((v - b) % (a - b) != 0) { // 위에 올라갈 곳이 있다면?
            day++;
        }

        System.out.println(day);
    }
}

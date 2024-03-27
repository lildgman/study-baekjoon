package unsolved.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_3009 {
    public static void main(String[] args) throws IOException {
        // 좌표로 직사각형을 이루면
        // 좌표가 짝을 이루게 된다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] point1 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine(), " ");
        int[] point2 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine(), " ");
        int[] point3 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        int x, y;

        // x 좌표끼리 비교
        // x는 x좌표가 다른 점의 x좌표값
        if (point1[0] == point2[0]) {
            x = point3[0];
        } else if (point1[0] == point3[0]) {
            x = point2[0];
        } else {
            x = point1[0];
        }

        // x 좌표끼리 비교
        // y는 y좌표가 다른 점의 y좌표값
        if (point1[1] == point2[1]) {
            y = point3[1];
        } else if (point1[1] == point3[1]) {
            y = point2[1];
        } else {
            y = point1[1];
        }

        System.out.println(x + " " + y);
    }
}

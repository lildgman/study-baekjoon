package solved.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int length_x_w = w - x;
        int length_y_h = h - y;

        ArrayList list = new ArrayList();
        list.add(x);
        list.add(y);
        list.add(length_y_h);
        list.add(length_x_w);

        Collections.sort(list);
        System.out.println(list.get(0));

    }
}

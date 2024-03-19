package solved.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2292 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 1;
        int room = 1;

        if (n == 1) {
            System.out.println(count);
        } else { // n이 2 이상일 때
            while (room < n) {
                room = room + (count * 6);
                count++;
            }
            System.out.println(count);

        }
    }
}

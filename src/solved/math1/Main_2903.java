package solved.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2903 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int start = 2;

        for (int i = num - 1; i >= 0; i--) {
            start += (int) Math.pow(2, i);
        }
        System.out.println(start*start);

    }

}


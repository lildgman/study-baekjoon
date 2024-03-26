package solved.multi_divi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_2581 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine()); // m 부터
        int n = Integer.parseInt(br.readLine()); // n 까지

        ArrayList primeList = new ArrayList();
        int sum = 0;


        for (int i = m; i <= n; i++) {
            ArrayList list = new ArrayList();
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    list.add(j);
                }
            }
            if (list.size() == 2) {
                primeList.add(i);
                sum += i;
            }
        }

        if (primeList.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(primeList.get(0));
        }


    }
}

package solved.multi_divi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            String str = br.readLine();
            st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken()); // 첫번째 수
            int b = Integer.parseInt(st.nextToken()); // 두번째 수

            if (a == 0 && b == 0) { // 두 수가 0이면 프로그램 종료
                return;
            }
            // 첫번째 수가 두번째 수의 약수면 factor
            // 첫번째 수가 두번째 수의 배수이면 multiple
            // 둘 다 아니면 neither

            // a 기준에서 b가 더 크게 되면 약수만 구할 수 있다.
            // a 기준에서 b가 더 작으면 배수만 구할 수 있다.
            if (a < b) {
                if (b % a == 0) {
                    System.out.println("factor");
                } else {
                    System.out.println("neither");
                }
            } else {
                if (a % b == 0) {
                    System.out.println("multiple");
                } else {
                    System.out.println("neither");
                }
            }


        }
    }
}

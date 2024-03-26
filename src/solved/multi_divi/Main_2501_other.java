package solved.multi_divi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2501_other {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken()); // 어떤 수의 약수를 구할건지?
        int b = Integer.parseInt(st.nextToken()); // b번째 수를 구하자
        int count = 0; // 약수의 개수
        int result = 0;


        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }

            if (count == b) {
                result = count;
                break;
            }
        }

        System.out.println(result);
    }
}

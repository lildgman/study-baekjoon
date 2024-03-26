package solved.multi_divi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken()); // 어떤 수의 약수를 구할건지?
        int b = Integer.parseInt(st.nextToken()); // 몇번쨰?

        ArrayList list = new ArrayList();

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                list.add(i);
            }
        }

        // b가 약수 개수를 벗어났을 경우에 예외처리
        try {
            System.out.println(list.get(b-1));
        } catch (Exception e) {
            System.out.println(0);
        }

    }
}

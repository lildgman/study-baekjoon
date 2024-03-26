package solved.multi_divi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] iArr = new int[n]; // 입력한 숫자들 들어가는 배열
        int count = 0; // 소수들의 개수

        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = Integer.parseInt(st.nextToken());
            ArrayList list = new ArrayList(); // iArr[i]의 약수를 담을 list

            for (int j = 1; j <= iArr[i]; j++) {
                if (iArr[i] % j == 0) {
                    list.add(j);
                }
            }
            if (list.size() == 2) { // 소수는 약수가 1과 자신뿐인 이므로 두개만 있을 것이다.
                count++;
            }
        }

        System.out.println(count);

    }
}

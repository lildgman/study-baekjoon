package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // n/m

        int value = 0; // 몫
        int mod = 0; // 나머지
        Stack stack = new Stack();

        while (true) {

            value = n / m;
            mod = n % m;
            if (mod >= 10 && mod <= 35) {
                stack.push((char) (mod+55));
            } else {
                stack.push(mod);
            }
            n = value;
            if (n / m == 0) {
                break;
            }
        }

        if (n != 0) {
            if (n >= 10 && n <= 35) {
                sb.append((char) (value + 55));
            } else {
                sb.append(value);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);

    }
}

package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10871 {
    // 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
    // 입력
    // 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
    // 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
    // 출력
    // X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(str1, " ");
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st1.nextToken());
        int x = Integer.parseInt(st1.nextToken());

        int[] a = new int[n];
        String str2 = br.readLine();

        StringTokenizer st2 = new StringTokenizer(str2, " ");
//        for (int i = 0; i < a.length; i++) {
//            a[i] = Integer.parseInt(st2.nextToken());
//            if (x > a[i]) {
//                sb.append(a[i]+" ");
//            }
//        }
        int index = 0;
        while (st2.hasMoreTokens()) {
            a[index] = Integer.parseInt(st2.nextToken());
            if (x > a[index]) {
                sb.append(a[index]+" ");
            }
            index++;

        }

        System.out.println(sb);
    }
}

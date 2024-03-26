package unsolved.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine()); // 입력받을 값

        int currCount = 1; // 현재 대각선에 있는 값의 개수
        int countSum = 0; // 값 개수 합계


        // 지금까지 대각선에 있는 값 개수의 합계 + 현재 대각선에 있는 값 개수 범위 판별
        while (true) {
            // x가 누전합 + 현재 대각선칸 개수보다 작으면 현재 대각선에 위치하고 있다는 뜻
            if (x <= countSum + currCount) {
                if (currCount % 2 == 1) { // 현재 대각선에 있는 값의 개수가 홀수이면
                    // 분자는 대각선상 블럭 개수 - (x-직전대각선까지 블럭수 -1)
                    // 분모는 x - 직전 대각선까지 블럭 수
                    System.out.println((currCount - (x - countSum - 1)) + "/" + (x - countSum));
                    break;
                } else {

                    System.out.println((x - countSum) + "/" + (currCount - (x - countSum - 1)));
                    break;
                }
            } else {
                countSum += currCount;
                currCount++;
            }
        }





    }
}

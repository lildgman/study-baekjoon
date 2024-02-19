package expert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        int[] alphabetCount = new int[26]; // 알파벳개수 배열 a~z

        // 입력받은 영어의 알파벳 개수
        for (int i = 0; i < str.length(); i++) {
            int count = str.charAt(i)-'A';
            alphabetCount[count]++;
        }

        int max = 0; // 가장 많은 개수
        char result = '?'; // 가장 많은 개수의 알파벳
        for (int i = 0; i < alphabetCount.length; i++) {
            if (max < alphabetCount[i]) {
                max = alphabetCount[i];
                result = (char) (i + 'A');
            } else if (max == alphabetCount[i]) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}

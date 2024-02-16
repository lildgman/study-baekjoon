package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_10809 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] arr = new int[26];

        Arrays.fill(arr, -1);

        int[] input = new int[str.length()];
        for (int i = 0; i < input.length; i++) {
            input[i] = str.charAt(i)-97;
            if (arr[input[i]] == -1) {
                arr[input[i]] = i;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

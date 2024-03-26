package solved.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9086 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            System.out.println(String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(str.length()-1)));
        }
    }
}

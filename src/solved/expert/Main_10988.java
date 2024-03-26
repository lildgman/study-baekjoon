package solved.expert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == (list.get(list.size() - (i + 1)))) {
                result = 1;
            } else {
                result = 0;
                break;
            }
        }
        System.out.println(result);
    }
}

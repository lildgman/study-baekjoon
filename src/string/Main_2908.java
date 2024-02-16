package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_2908 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        String str1 = "";
        String str2 = "";

        while (st.hasMoreTokens()) {
            str1 = st.nextToken();
            str2 = st.nextToken();
        }

        StringBuilder reverse1 = new StringBuilder(str1).reverse();
        StringBuilder reverse2 = new StringBuilder(str2).reverse();

        str1 = String.valueOf(reverse1);
        str2 = String.valueOf(reverse2);

        System.out.println(Math.max(Integer.parseInt(str1), Integer.parseInt(str2)));
    }
}

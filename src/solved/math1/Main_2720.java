package solved.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        double[] coin = {0.25, 0.10, 0.05, 0.01};

        for (int i = 0; i < t; i++) {
            double num = Integer.parseInt(br.readLine())/100.0;
            for (int j = 0; j < coin.length; j++) {
                BigDecimal mod;
                int value = (int)(num / coin[j]);
                sb.append(value).append(" ");
                mod = BigDecimal.valueOf(num).remainder(BigDecimal.valueOf(coin[j]));
                if (mod.equals(0)) {
                    break;
                }
                num = Double.parseDouble(mod.toString());
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

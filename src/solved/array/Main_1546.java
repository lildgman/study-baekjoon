package solved.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1546 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        double[] arr = new double[n];

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (max < arr[i]) {
                max = (int) arr[i];
            }
        }

        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / max * 100;
            total += arr[i];
        }

        double avg = total / n;
        System.out.println(Math.round(avg*100.0)/100.0);

    }
}

package two_dimensional_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2738 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        for (int i = 0; i < arr1.length; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str, " ");
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str, " ");
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print((arr1[i][j] + arr2[i][j])+" ");
            }
            System.out.println();
        }
    }
}

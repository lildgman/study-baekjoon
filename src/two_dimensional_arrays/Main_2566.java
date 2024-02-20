package two_dimensional_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int max = 0;
        String maxValueLocation = "1 1";

        int[][] arr2D = new int[9][9];

        for (int i = 0; i < arr2D.length; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str," ");
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][j] = Integer.parseInt(st.nextToken());
                if (max < arr2D[i][j]) {
                    max = arr2D[i][j];
                    maxValueLocation = (i+1) +" " + (j+1);
                }
            }
        }
        System.out.println(max);
        System.out.println(maxValueLocation);
    }
}

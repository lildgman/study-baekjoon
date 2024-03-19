package solved.expert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_25206 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String[] gradeArr = new String[20];
    static int index = 0;

    static double totalHakjum = 0.0;

    public static void main(String[] args) throws IOException {

        double total = 0.0;
        for (int i = 0; i < 20; i++) {
            total += getScore();
        }
        double avg = total/totalHakjum;
        System.out.println(Math.round(avg*10000.0)/10000.0);
    }

    public static double getScore() throws IOException {
        double grade = 0;
        String str = br.readLine();

        double hakjum = Double.parseDouble(str.split(" ")[1]);
        gradeArr[index] = str.split(" ")[2];

        if (!gradeArr[index].equals("P")) {
            totalHakjum += hakjum;
        }

        switch (gradeArr[index]) {
            case "A+":
                grade = 4.5;
                break;
            case "A0":
                grade = 4.0;
                break;
            case "B+":
                grade = 3.5;
                break;
            case "B0":
                grade = 3.0;
                break;
            case "C+":
                grade = 2.5;
                break;
            case "C0":
                grade = 2.0;
                break;
            case "D+":
                grade = 1.5;
                break;
            case "D0":
                grade = 1.0;
                break;
            case "F":
            case "P":
                break;

        }
        index++;

        return hakjum*grade;
    }
}

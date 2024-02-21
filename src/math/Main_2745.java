package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");
        String num = st.nextToken();
        int jinsu = Integer.parseInt(st.nextToken());

        String[] arr = num.split("");
        int result = 0;

        int strToNum = 0;
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i].toUpperCase()) {
                case "A":
                    strToNum = 10;
                    break;
                case "B":
                    strToNum = 11;
                    break;
                case "C":
                    strToNum = 12;
                    break;
                case "D":
                    strToNum = 13;
                    break;
                case "E":
                    strToNum = 14;
                    break;
                case "F":
                    strToNum = 15;
                    break;
                case "G":
                    strToNum = 16;
                    break;
                case "H":
                    strToNum = 17;
                    break;
                case "I":
                    strToNum = 18;
                    break;
                case "J":
                    strToNum = 19;
                    break;
                case "K":
                    strToNum = 20;
                    break;
                case "L":
                    strToNum = 21;
                    break;
                case "M":
                    strToNum = 22;
                    break;
                case "N":
                    strToNum = 23;
                    break;
                case "O":
                    strToNum = 24;
                    break;
                case "P":
                    strToNum = 25;
                    break;
                case "Q":
                    strToNum = 26;
                    break;
                case "R":
                    strToNum = 27;
                    break;
                case "S":
                    strToNum = 28;
                    break;
                case "T":
                    strToNum = 29;
                    break;
                case "U":
                    strToNum = 30;
                    break;
                case "V":
                    strToNum = 31;
                    break;
                case "W":
                    strToNum = 32;
                    break;
                case "X":
                    strToNum = 33;
                    break;
                case "Y":
                    strToNum = 34;
                    break;
                case "Z":
                    strToNum = 35;
                    break;
                default:
                    strToNum = Integer.parseInt(arr[i]);
            }
            result += strToNum*((int)Math.pow(jinsu, arr.length-(i+1)));
        }
        System.out.println(result);
    }
}

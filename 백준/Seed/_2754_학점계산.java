package Seed;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2754_학점계산 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        double score = switch (input) {
            case "A+" -> 4.3;
            case "A0" -> 4.0;
            case "A-" -> 3.7;
            case "B+" -> 3.3;
            case "B0" -> 3.0;
            case "B-" -> 2.7;
            case "C+" -> 2.3;
            case "C0" -> 2.0;
            case "C-" -> 1.7;
            case "D+" -> 1.3;
            case "D0" -> 1.0;
            case "D-" -> 0.7;
            case "F" -> 0.0;
            default -> -1;
        };

        System.out.println(score);

    }
}

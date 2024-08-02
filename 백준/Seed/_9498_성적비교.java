package Seed;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _9498_성적비교 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        boolean A = x >= 90 && x <= 100;
        boolean B = x >= 80 && x <= 89;
        boolean C = x >= 70 && x <= 79;
        boolean D = x >= 60 && x <= 69;

        if (A) {
            System.out.println("A");
        } else if (B) {
            System.out.println("B");
        } else if (C) {
            System.out.println("C");
        } else if (D) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}

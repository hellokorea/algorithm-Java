package Seed;

import java.util.Scanner;

public class _2438_별찍기 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        // for (int i = 1; i <= N; i++) {
        // System.out.print("*".repeat(i));
        // System.out.println();
        // }

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

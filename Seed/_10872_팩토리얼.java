package Seed;

import java.util.Scanner;

public class _10872_팩토리얼 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.close();

        int result = factorial(N);
        System.out.println(result);
    }

    static int factorial(int N) {

        if (N == 1 || N == 0) {
            return 1;
        }

        return N * factorial(N - 1);
    }
}

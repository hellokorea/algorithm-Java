package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B3_2444_별찍기_7 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {

            for (int j = N - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = N - 1; i > 0; i--) {

            for (int j = N - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

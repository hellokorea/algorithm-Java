package Seed;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _5597_과제안낸사람 {
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // ^ Solution
        boolean[] submitted = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine());
            submitted[num] = true;
        }

        int[] missing = new int[2];
        int index = 0;

        for (int i = 1; i <= 30; i++) {

            if (!submitted[i]) {
                missing[index++] = i;
            }
        }

        System.out.println(missing[0]);
        System.out.println(missing[1]);
    }
}

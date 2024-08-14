package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class B2_3052_나머지 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*
         * 1. 입력 값을 받을 때 마다 42로 나눈 나머지 값을 set에 저장한다.
         * 2. set에 있는 size를 출력한다.
         */

        Set<Integer> set = new HashSet<>();

        for (int index = 0; index < 10; index++) {
            int num = Integer.parseInt(br.readLine());

            set.add(num % 42);
        }

        System.out.println(set.size());

        // ---
        // int[] remainder = new int[42];

        // for (int i = 0; i < 10; i++) {
        // int num = Integer.parseInt(br.readLine());
        // int rem = num % 42;
        // remainder[rem] = 1;
        // }

        // int count = 0;

        // for (int i = 0; i < 42; i++) {
        // if (remainder[i] == 1) {
        // count++;
        // }
        // }

        // System.out.println(count);
    }
}

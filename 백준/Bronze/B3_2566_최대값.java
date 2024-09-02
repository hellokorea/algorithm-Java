package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_2566_최대값 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // ? idea
        // 1. 입력 받은 81개의 수를 입력 받아 9X9 배열을 생성한다.
        // 2. 배열을 순회하면서 최대 값을 찾는다.
        // 3. 최대 값을 찾을 때 마다 갱신하고, 해당 i, j 값을 저장한다.
        // 4. 순회 종료 시 해당 값을 출력한다.

        int[][] inputArray = new int[10][10];

        for (int i = 1; i < 10; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j < 10; j++) {
                inputArray[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = inputArray[1][1];
        int maxI = 1;
        int maxJ = 1;

        for (int i = 1; i < 10; i++) {

            for (int j = 1; j < 10; j++) {
                int v = inputArray[i][j];

                if (v > max) {
                    max = v;
                    maxI = i;
                    maxJ = j;
                }
            }
        }

        System.out.println(max);
        System.out.print(maxI + " " + maxJ);
    }
}

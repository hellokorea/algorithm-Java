package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_10810_공넣기 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] input = new int[M][3];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        /*
         * 1. input 중첩 반복을 통해서 바구니 index에 있는 값을 bucket 배열 인덱스 값에 덮는다.
         */

        // Solution
        int[] bucket = new int[N + 1];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 2; j++) {
                int start = input[i][0];
                int end = input[i][1];

                while (start <= end) {
                    bucket[start++] = input[i][2];
                }
            }
        }

        for (int i = 1; i < bucket.length; i++) {
            System.out.print(bucket[i] + " ");
        }
    }
}

package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2_10813_공넣기 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        /*
         * 1. 2차원 배열을 만들어 각각 M에 대한 행동을 입력한다.
         * 2. 만들어진 배열을 M회 반복하면서 i, j에 대한 값을 받아 서로 값을 교환한다. temp 사용
         * 3. 공을 담을 1차원 배열을 만들어서 교환 이후의 공의 번호를 입력시킨다.
         */

        int[] result = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            result[i] = i;
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 2; j++) {
            }
        }

        //

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int currentIdx = Integer.parseInt(st.nextToken());
            int changeIdx = Integer.parseInt(st.nextToken());

            int temp = result[currentIdx];
            result[currentIdx] = result[changeIdx];
            result[changeIdx] = temp;
        }

        for (int i = 1; i <= N; i++) {
            sb.append(result[i]).append(" ");
        }

        System.out.println(sb.toString());
    }
}
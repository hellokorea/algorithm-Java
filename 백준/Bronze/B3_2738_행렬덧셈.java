package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_2738_행렬덧셈 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // ? idea
        // 1. N X M 배열의 2차원 배열 2개를 입력 받아 생성한다.
        // 2. A 배열 순회 시 [y][x]의 대응되는 B 배열의 인덱스의 값을 서로 매핑하여 더한다.
        // 2.1. 1줄씩 더할 때 마다 출력하고 줄 바꿈 처리한다.

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < M; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // Sol

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < M; j++) {
                int sum = A[i][j] + B[i][j];

                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}

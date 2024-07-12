package Seed;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2738_행렬덧셈 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr2x = new int[N * 2][M];

        // Input
        for (int i = 0; i < N * 2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr2x[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // ^ Solution
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int mix = arr2x[i][j] + arr2x[i + N][j];
                System.out.print(mix + " ");
            }
            System.out.println();
        }

    }
}

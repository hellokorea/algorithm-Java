package 프로그래머스.Level_2;

import java.util.Arrays;

public class 행렬의곱셉 {

    // [문제 링크] https://school.programmers.co.kr/learn/courses/30/lessons/12949
    public static void main(String[] args) {
        int[][] input1 = { { 1, 4 }, { 3, 2 }, { 4, 1 } };
        int[][] input2 = { { 3, 3 }, { 3, 3 } };

        int[][] input3 = { { 2, 3, 2 }, { 4, 2, 4 }, { 3, 1, 4 } };
        int[][] input4 = { { 5, 4, 3 }, { 2, 4, 1 }, { 3, 1, 1 } };

        int[][] result = solution(input1, input2);

        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }

    // 1. 선형대수의 행렬 곱이므로 C[i][j] 의 원소 값은 A의 i 값과 B의 j 열의 원소이다.
    // 2. C 배열을 담을 m X p 크기를 생성하여 각 원소의 값을 담는다.

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int m = arr1.length;
        int p = arr2[0].length;

        int[][] c = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    c[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return c;
    }
}

// 어쨌든 인접행렬은 C[i][j] += A[i][k] * B[k][j] 이다.
// C 의 크기는 m X p 로 정의된다.
// 다시 말해 A 현재 행의 각 원소 값과 B는 열을 이동하며 열에 위치한 원소 값을 더한다.

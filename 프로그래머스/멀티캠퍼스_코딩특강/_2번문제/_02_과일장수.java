package 프로그래머스.멀티캠퍼스_코딩특강._2번문제;

import java.util.Arrays;

public class _02_과일장수 {

    public static void main(String[] args) {
        int[] socre = { 1, 2, 3, 1, 2, 3, 1 }; // 3, 4
        int[] score2 = { 4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2 }; // 4, 3

        int result = solution(3, 4, socre);

        System.out.println(result);
    }

    static int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for (int i = score.length - m; i >= 0; i -= m) {
            int cal = score[i] * m;
            answer += cal;
        }

        return answer;
    }
}

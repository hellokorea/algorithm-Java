package 프로그래머스.Levle_1;

import java.util.*;

public class 모의고사_완전탐색 {

    // [문제 링크] https://school.programmers.co.kr/learn/courses/30/lessons/42840

    public static void main(String[] args) {
        // int[] input = { 1, 2, 3, 4, 5 };
        int[] input2 = { 1, 3, 2, 4, 2 };

        int[] result = solution(input2);

        System.out.println("result : " + Arrays.toString(result));
    }

    // 1. 각각 수포자들의 패턴을 2차원 배열을 생성한다.
    // 1.1 각각 수포자들의 점수를 담을 길이 3의 scores 을 생성한다.
    // 2. 정답 배열과 수포자들의 배열을 반복 중첩문을 통해 점수 배열 값과 패턴 값을 비교하여 일치하면 scores 배열에 인덱스에 맞게
    // 점수를 저장한다.
    // 2.1 scores 배열의 max값을 저장한다.
    // 3. scores 배열을 순회하면서 Max 값을 비교하며, 같으면 i + 1을 통해 n번 수포자 값을 리스트에 저장한다.

    static public int[] solution(int[] answers) {
        int[][] patterns = {
                { 1, 2, 3, 4, 5 },
                { 2, 1, 2, 3, 2, 4, 2, 5 },
                { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 }
        };

        int[] scores = new int[3];

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < patterns.length; j++) {
                if (answers[i] == patterns[j][i % patterns[j].length]) {
                    scores[j]++;
                }
            }
        }

        int maxScore = Arrays.stream(scores).max().getAsInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                list.add(i + 1);
            }
        }

        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
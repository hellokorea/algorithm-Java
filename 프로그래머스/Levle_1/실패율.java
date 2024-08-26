package 프로그래머스.Levle_1;

import java.util.Arrays;

public class 실패율 {

    // [문제 링크] : https://school.programmers.co.kr/learn/courses/30/lessons/42889

    public static void main(String[] args) {
        // Test Case
        int N1 = 5;
        int[] array1 = { 2, 1, 2, 6, 2, 4, 3, 3 };

        int N2 = 4;
        int[] array2 = { 4, 4, 4, 4, 4 };

        int[] result = solution(N1, array1);
        System.out.println(Arrays.toString(result));
    }

    // 1. 1번 스테이지부터 순차적으로 클리어 유저 수와 미클리어 유저수를 구한다.
    // 2. 실패율을 계산하고, 클리어 유저 수를 따로 저장하며 예외 처리 한다.
    // 3. 1~5번 스테이지에 실패율을 모두 구한 뒤에, 각 스테이지 별로 계산 된 실패율 값을 저장한다.
    // 4. 스테이지 별 실패율을 내림차순으로 정렬하며, 실패율이 같다면 작은 번호가 앞으로 오도록 정렬한다.

    public static int[] solution(int N, int[] stages) {
        double[] failureRates = new double[N + 1];
        Integer[] stageOrder = new Integer[N];

        int totalUser = 0;
        int unFinishUser = 0;

        for (int i = 1; i <= N; i++) {
            int currentStage = i;
            totalUser = 0;
            unFinishUser = 0;

            for (int stage : stages) {
                if (stage >= currentStage) {
                    totalUser++; // 클리어 했거나 현재 머무르고 있는 유저 수
                }
                if (stage == currentStage) {
                    unFinishUser++; // 현재 스테이지를 클리어 하지 못한 유저 수
                }
            }

            if (totalUser == 0) {
                failureRates[i - 1] = 0.0;
            } else {
                failureRates[i - 1] = (double) unFinishUser / totalUser;
            }

            stageOrder[i - 1] = i;
        }

        Arrays.sort(stageOrder, (o1, o2) -> {
            if (failureRates[o2 - 1] != failureRates[o1 - 1]) {
                return Double.compare(failureRates[o2 - 1], failureRates[o1 - 1]);
            } else {
                return Integer.compare(o1, o2);
            }
        });

        return Arrays.stream(stageOrder).mapToInt(i -> i).toArray();
    }
}

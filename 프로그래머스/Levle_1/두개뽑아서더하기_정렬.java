package 프로그래머스.Levle_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 두개뽑아서더하기_정렬 {

    // [문제 링크] https://school.programmers.co.kr/learn/courses/30/lessons/68644

    public static void main(String[] args) {
        // int[] input = { 2, 1, 3, 4, 1 };
        int[] input2 = { 5, 0, 2, 7 };

        int[] result = solution(input2);

        System.out.println(Arrays.toString(result));
    }

    // 1. numbers를 이중 반복문을 통해 해당 인덱스에서 j++하며, 더한 값을 ArrayList에 담는다.
    // 2. ArrayList에 담을 때 중복은 제외한다.
    // 3. 이중 for문이 끝나면, list를 sort한다.

    public static int[] solution(int[] numbers) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                int cal = numbers[i] + numbers[j];

                if (!list.contains(cal)) {
                    list.add(cal);
                }
            }
        }

        int[] result = new int[list.size()];

        Collections.sort(list);

        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}

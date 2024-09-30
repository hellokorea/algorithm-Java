package 프로그래머스.Level_2;

import java.util.Stack;

public class 짝지어제거하기 {

    public static void main(String[] args) {
        String input = "baabaa";
        String input2 = "cdcd";

        System.out.println(solution(input));
    }

    // ? idea
    // 1. 문자열을 넣을 때 마다 peek()을 통해서 현재 문자열과 같은지 검사한다.
    // 2. 만약 같다면 pop()을 통해 제거하고, 다시 또 위를 반복한다.
    // 3. 문자열 반복이 끝났을 때 stack이 비어있으면 1, 아니면 0을 return한다.

    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!stack.isEmpty() && c == stack.peek()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}

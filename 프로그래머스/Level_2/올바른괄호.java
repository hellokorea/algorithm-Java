package 프로그래머스.Level_2;

import java.util.Stack;

public class 올바른괄호 {

    // [ 문제 링크 ] : https://school.programmers.co.kr/learn/courses/30/lessons/12909

    public static void main(String[] args) {
        String input1 = "(())()";
        String input2 = "(()(";
        String input3 = ")()(";

        System.out.println(solution2(input3));
    }

    // ? idea
    // 1. Stack을 생성하여 입력 값을 전부 push하고, 순회하며 pop한다.
    // 2. 이 때 ( 가 들어오면 +1, ) 가 들어오면 -1를 해서 0이면 올바른 괄호로 처리한다.
    // 2.1. input balance와 output balance가 0이면 true

    // & issue
    // 1. input3 case같은 경우 0이 되버리지만, ()()같은 올바른 괄호가 아니기 때문에 문제가 발생한다.
    // 2. 즉, 기존 방식이 아닌 새로운 접근으로 문제를 해결해야 한다.

    // ^ sol
    // 1. ) 가 ( 보다 많으면 애초에 괄호 자체가 성립이 안되므로 balacne < 0 이 되는 순간 false로 처리한다.

    static boolean solution(String s) {
        int balance = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                balance++;
            } else {
                balance--;
            }

            if (balance < 0) {
                return false;
            }

        }

        return balance == 0;
    }

    // Stack 사용
    // 1. 위 코드는 굳이 Stack을 쓸 필요없이 한 것이고, 아래 코드는 Stack을 통해 푼 코드이다.
    static boolean solution2(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.pop() == c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

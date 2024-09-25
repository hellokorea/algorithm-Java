package 프로그래머스.Level_2;

import java.util.Stack;

public class 괄호회전하기 {

    public static void main(String[] args) {
        String input1 = "[](){}";
        String input2 = "}]()[{";
        String input3 = "}}}";

        System.out.println(solution(input1));
    }

    // ? idea
    // 1. s의 문자열 -1 만큼 반복하면서 올바른 문자열인지 검사한다.
    // 1.1. 검사 방법 = 스택에 1개씩 문자를 넣어 상쇄 시킨다.
    // 2. 올바른 문자열이면 true, 아니면 false를 반환하고 true 일 때 ++ 처리.
    // 3. 왼쪽 한칸 회전

    // & issue
    // 1. s로 들어오는 문자열이 올바른 괄호인지 아닌지 판단 실패.
    // -> 괄호의 종류가 다양하기도하고

    // ^ Sol
    // 1. 복잡하게 생각할 것 없다.
    // 2. ( { [ 가 들어있을 때 무조건 맨 위에 요소랑 결합이 안되면 반드시 false이다.
    // 3. 그러므로, 이를 통해서 비교한다.

    public static int solution(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            if (isVaild(s)) {
                result++;
            }

            s = rotate(s);
        }
        return result;
    }

    public static boolean isVaild(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (c == ')' && top != '(' ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static String rotate(String s) {
        StringBuilder sb = new StringBuilder(s);

        char firstChar = sb.charAt(0);
        sb.deleteCharAt(0);
        sb.append(firstChar);

        return sb.toString();
    }
}
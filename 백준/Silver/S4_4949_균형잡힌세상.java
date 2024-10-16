package Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class S4_4949_균형잡힌세상 {

    // ? idea
    // 1. 각 행의 문자열을 문자를 검증하며, "." 일 경우 다음 행으로 넘어가게 입력을 처리한다.
    // 2. (, [ 일 때 스택에 넣고, 그 다음에 들어오는 문자가 ), ] 인지 검사하여 짝을 이루는지 체크한다.
    // 3. 위 과정을 반복하며 YES, NO를 출력

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();

            if (str.equals(".")) {
                break;
            }

            System.out.println(isBalanced(str) ? "yes" : "no");
        }
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')') {

                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }

                stack.pop();

            } else if (c == ']') {

                if (stack.isEmpty() || stack.peek() != '[') {
                    return false;
                }

                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
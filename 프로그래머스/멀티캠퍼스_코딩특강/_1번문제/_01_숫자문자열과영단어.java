package 프로그래머스.멀티캠퍼스_코딩특강._1번문제;

public class _01_숫자문자열과영단어 {

    public static void main(String[] args) {
        // one4seveneight
        // 23four5six7
        // 2three45sixseven

        String s = "one4seveneight";
        int result = solution(s);
        System.out.println(result);
    }

    static int solution(String s) {
        String[] change = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        for (int i = 0; i < 10; i++) {
            s = s.replaceAll(change[i], Integer.toString(i));
        }

        return Integer.parseInt(s);
    }

}

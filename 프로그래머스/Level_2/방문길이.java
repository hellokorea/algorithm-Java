package 프로그래머스.Level_2;

import java.util.HashSet;
import java.util.Set;

public class 방문길이 {

    // 문제 링크 :
    // https://school.programmers.co.kr/learn/courses/30/lessons/49994?language=java

    public static void main(String[] args) {

        String input1 = "ULURRDLLU";
        String input2 = "LULLLLLLU";

        System.out.println(solution(input1));
    }

    // ? idea
    // 1. 11 X 11 배열을 만들어 이동할 수 있는 맵을 생성한다.
    // 2. (5, 5) 를 기준으로 시작해서 커맨드를 입력받아 캐릭터를 이동시키며 이동 거리를 +1 한다.
    // 2.1. 단, 이 때의 인덱스 값을 0일 경우에만 + 1하고, 1이라면 +1 처리를 하지 않는다.
    // 3. 커맨드를 입력받아 이동할 때 x, y = 0, 10 범위를 벗어나는 경우 커맨드를 무시한다.

    // & issue
    // 방문 여부 체크와 이동한 길이도 체크는 잘 했는데 +1이 누락되고 있다.
    // 아마 처음 출발 할 때 부터 +1을 안시켜서 그런건가? 정확한 원인을 파악하지 못함

    // ^ Sol
    // 방문 좌표만 중복 검사를 하는 것이 문제였다. 즉, 경로라는 것은 정방향과 역방향이 같이 중복 체크가 되어야 한다.
    // 기존 코드는 y,x 좌표만 가지고 체크를 했으니 count가 제대로 증가하지 않은 것이 문제였다.
    // > 그래서 HashSet을 통해 중복 없이 값을 저장하는 객체를 만들어 해결한다.

    public static int solution(String dirs) {
        int count = 0;

        Set<String> visitedPath = new HashSet<>();

        int currentY = 0;
        int currentX = 0;

        for (int i = 0; i < dirs.length(); i++) {
            char cmd = dirs.charAt(i);
            int y = currentY;
            int x = currentX;

            switch (cmd) {
                case ('U') -> y--;
                case ('D') -> y++;
                case ('L') -> x--;
                case ('R') -> x++;
            }

            if (y < -5 || y > 5 || x < -5 || x > 5) {
                continue;
            }

            String path1 = currentY + "," + currentX + "->" + y + "," + x; // 정방향 경로
            String path2 = y + "," + x + "->" + currentY + "," + currentX; // 역방향 경로

            if (!visitedPath.contains(path1) && !visitedPath.contains(path2)) {
                visitedPath.add(path1);
                visitedPath.add(path2);
                count++;
            }

            currentY = y;
            currentX = x;
        }

        return count;
    }
}

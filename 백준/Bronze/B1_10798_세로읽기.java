package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1_10798_세로읽기 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // ? idea
        // 1. 2차원 배열로 입력 받은 문자열로 구성한다.
        // 2. 그 다음 중첩 반복을 통해 y을 값을 이동하며 세로로 읽는다.
        // 3. 세로로 읽을 때 해당 값이 없으면 넘어간다.
        // 4. 세로로 읽은 문자열을 출력한다.

        char[][] inputStr = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String r = br.readLine();

            for (int j = 0; j < r.length(); j++) {
                inputStr[i][j] = r.charAt(j);
            }
        }

        for (int i = 0; i < inputStr[0].length; i++) {
            for (int j = 0; j < 5; j++) {
                char s = inputStr[j][i];

                if (s == 0) {
                    continue;
                }
                sb.append(s);
            }
        }
        System.out.println(sb.toString());
    }
}

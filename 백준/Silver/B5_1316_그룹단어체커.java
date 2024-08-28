package Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B5_1316_그룹단어체커 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // ? idea
        // 1. 문자열 1개를 받으면 이중반복을 통해 해당 문자열이 계속 등장하는지 아닌지 체크한다.
        // 2. 내부 순회 도중 문자가 다르다면 그 다음 인덱스부터 다시 순회해서 해당 문자가 등장하는지 안하는지 체크한다.
        // 3. 2번의 경우에서 등장한다면 그룹 단어가 아니다.

        // * feedback
        // 1. 접근 자체는 괜찮았다. 물론 반복문 중첩이 많아 코드가 간결하지 않지만 실행 시간 및 로직 또한 정확했다.
        // 2. 그러나 분기 로직에서 필요 없는 로직과 word.charAt(l) 을 사용하지 못해 미숙했다.
        // 2.1. 즉 단어가 다를 경우 내부 반복에서 index가 이동해야 하니 (l)을 사용 해야했다.

        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            boolean isGroup = true;

            for (int j = 0; j < word.length(); j++) {
                char s1 = word.charAt(j);

                for (int k = j + 1; k < word.length(); k++) {
                    char s2 = word.charAt(k);

                    if (s1 != s2) {
                        for (int l = k + 1; l < word.length(); l++) {
                            if (s1 == word.charAt(l)) {
                                isGroup = false;
                                break;
                            }
                        }
                    }
                    if (!isGroup) {
                        break;
                    }
                }
                if (!isGroup) {
                    break;
                }
            }

            if (isGroup) {
                count++;
            }
        }

        System.out.println(count);
    }
}

package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B2_10809_알파벳찾기 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] posisiton = new int[26];

        for (int i = 0; i < posisiton.length; i++) {
            posisiton[i] = -1;
        }

        // 아스키 코드를 활용하여 'a' = 95이므로, 26길이 배열을 만들어서 a = 0, b = 1에 맞게 인덱스에 대응하게 한다.
        // 즉, b 는 index가 1이므로 => 98 - 97 => 1 => b 로 처리한다.

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a';

            if (posisiton[index] == -1) {
                posisiton[index] = i;
            }
        }

        for (int i = 0; i < posisiton.length; i++) {
            System.out.print(posisiton[i] + " ");
        }
    }
}

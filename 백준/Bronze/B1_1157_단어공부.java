package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1_1157_단어공부 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine().toUpperCase();

        // 1. 먼저 입력 된 단어를 모두 대문자로 변환한다 ( 대소 문자 구분 X, 대문자로 반환 )
        // 2. 알파벳을 전부 담을 배열 1개, 숫자를 담은 배열 1개 생성 ( 등장 값과 알파벳 매핑 )
        // 3. 입력 된 문자열을 순회 하면서 해당 문자에 맞는 숫자 배열의 인덱스 값을 증가 시킨다
        // 4. 마지막으로 가장 많이 등장한 인덱스 값을 얻어 알파벳 배열과 매핑시켜 알파벳을 추출한다

        char[] alphabet = new char[26];
        int[] mapping = new int[26];

        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int idx = c - 'A';
            mapping[idx]++;
        }

        int maxIdx = 0;
        int max = mapping[0];

        for (int i = 0; i < 26; i++) {
            if (mapping[i] > max) {
                max = mapping[i];
                maxIdx = i;
            }
        }

        char result = 'A';

        for (int i = maxIdx + 1; i < mapping.length; i++) {
            if (mapping[maxIdx] == mapping[i]) {
                result = '?';
                break;
            }
        }

        char a = result == '?' ? '?' : alphabet[maxIdx];

        System.out.println(a);
    }
}

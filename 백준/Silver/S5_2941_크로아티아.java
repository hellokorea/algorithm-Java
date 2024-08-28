package Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S5_2941_크로아티아 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        // ? idea
        // 1. word 문자를 순회하면서 크로아티아 알파벳 문자와 같은지 검사한다.
        // 2. 같다면 count++하고, 문자열을 비운다.
        // 3. 다르더라도 count++하고 다시 순회를 진행한다.

        // & 문제점 :
        // "ddz=" 일 때 dd가 되면 기존의 누적되어 있는 문자열 때문에 정확한 검사가 불가능해진다.
        // 즉, d가 들어오고나서, 그 다음 dz=이 들어왔을 때 검사해야 하는데 이 문제가 해결되지 않는다.

        // * Sol
        // --> String.contains() 메서드를 통해 해당 문자열에 크로아티아 문자열이 존재하는지 검색한다.
        // --> 존재한다면 해당 단어를 "*"로 변경하여 1개짜리 문자열로 변경한다.
        // --> 변경 완료 후 입력 된 단어의 길이를 출력한다.

        String[] croatiaWords = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

        for (String coratia : croatiaWords) {

            if (word.contains(coratia)) {
                word = word.replace(coratia, "*");
            }
        }

        System.out.println(word.length());
    }
}

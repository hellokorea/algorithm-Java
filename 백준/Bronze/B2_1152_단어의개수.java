package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2_1152_단어의개수 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int count = 0;

        int isContinue = 0;

        for (int i = 0; i < input.length(); i++) {
            char s = input.charAt(i);

            boolean isChar = false;

            if (s == ' ') {
                isContinue = 0;
                continue;
            } else {
                isChar = true;
            }

            if (isChar & isContinue == 0) {
                count++;
                isContinue++;
            }
        }

        System.out.println(count);
    }
}

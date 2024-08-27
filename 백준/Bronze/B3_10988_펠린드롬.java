package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B3_10988_펠린드롬 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String word = br.readLine();

        for (int i = word.length(); i > 0; i--) {
            sb.append(word.charAt(i - 1));
        }

        int isPl = sb.toString().equals(word) ? 1 : 0;

        System.out.println(isPl);
    }
}

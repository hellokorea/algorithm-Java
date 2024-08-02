package Seed;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _9086_문자출력2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            int len = (s.length()) - 1;

            char startChar = s.charAt(0);
            char endChar = s.charAt(len);

            System.out.println(startChar + "" + endChar);
        }
    }
}

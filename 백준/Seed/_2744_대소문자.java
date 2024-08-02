package Seed;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2744_대소문자 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int len = input.length();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < len; i++) {
            char s = input.charAt(i);

            if (Character.isUpperCase(s)) {
                output.append(Character.toLowerCase(s));
            } else {
                output.append(Character.toUpperCase(s));
            }
        }

        System.out.println(output);
    }
}

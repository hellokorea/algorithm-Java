package Seed;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _11718_문자출력 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();

            if (s == null) {
                break;
            }

            System.out.println(s);
        }

    }
}

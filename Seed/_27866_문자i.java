package Seed;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _27866_문자i {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int I = Integer.parseInt(br.readLine());

        System.out.println(S.charAt(I - 1));

    }
}

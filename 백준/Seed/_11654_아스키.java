package Seed;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _11654_아스키 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char asciiCode = input.charAt(0);
        int asciiValue = (int) asciiCode;
        System.out.println(asciiValue);
    }
}

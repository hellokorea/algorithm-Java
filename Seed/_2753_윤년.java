package Seed;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2753_윤년 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        boolean isY = x % 4 == 0 && !(x % 100 == 0) || x % 400 == 0;

        if (isY) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}

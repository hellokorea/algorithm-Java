package Seed;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _14681_사분면구하기1 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        getQuadrant(x, y);
    }

    static void getQuadrant(int x, int y) {

        if (x < 0 && y < 0) {
            System.out.println("3");
        } else if (x > 0 && y > 0) {
            System.out.println("1");
        } else if (x > 0 && y < 0) {
            System.out.println("4");
        } else {
            System.out.println("2");
        }
    }
}

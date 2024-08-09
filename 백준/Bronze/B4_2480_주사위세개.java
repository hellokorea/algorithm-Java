package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4_2480_주사위세개 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());

        int reward = 0;

        if (num1 == num2 && num2 == num3) {
            reward = 10000 + num1 * 1000;
        } else if (num1 == num2 || num1 == num3) {
            reward = 1000 + num1 * 100;
        } else if (num2 == num3) {
            reward = 1000 + num2 * 100;
        } else {
            int max = Math.max(num1, Math.max(num2, num3));
            reward = max * 100;
        }

        System.out.println(reward);
    }
}

package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B3_2562_최대값 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int idx = 1;
        int seq = 0;

        while (idx < 10) {
            int num = Integer.parseInt(br.readLine());
            if (num > max) {
                max = num;
                seq = idx;
            }
            idx++;
        }

        System.out.println(max);
        System.out.println(seq);
    }
}

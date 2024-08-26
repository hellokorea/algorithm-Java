package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5_3003_체스 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] whitePins = new int[6];
        int[] pins = { 1, 1, 2, 2, 2, 8 };

        for (int i = 0; i < 6; i++) {
            whitePins[i] = Integer.parseInt(st.nextToken());
        }

        // sol
        for (int i = 0; i < 6; i++) {
            int count = 0;

            if (whitePins[i] > pins[i]) {

                while (whitePins[i] > pins[i]) {
                    whitePins[i]--;
                    count--;
                }
            } else if (whitePins[i] < pins[i]) {

                while (whitePins[i] < pins[i]) {
                    whitePins[i]++;
                    count++;
                }
            }

            sb.append(count).append(" ");
        }

        System.out.println(sb);
    }
}

// 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개

// 0 1 2 2 2 7
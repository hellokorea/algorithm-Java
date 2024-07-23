package Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S5_2536_색종이 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        boolean[][] canvas = new boolean[100][100];

        int sum = 0;

        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int dx = 0; dx < 10; dx++) {
                for (int dy = 0; dy < 10; dy++) {

                    if (!canvas[x + dx][y + dy]) {
                        canvas[x + dx][y + dy] = true;
                        sum++;
                    }
                }
            }
        }

        System.out.println(sum);
    }
}

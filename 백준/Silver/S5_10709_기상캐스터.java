package Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S5_10709_기상캐스터 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        int[][] clouds = new int[H + 1][W];

        for (int i = 1; i <= H; i++) {
            int move = 0;
            boolean isCloud = false;
            String input = br.readLine();

            for (int j = 0; j < W; j++) {
                char s = input.charAt(j);

                if (s == 'c') {
                    move = 0;
                    clouds[i][j] = move;
                    isCloud = true;
                } else if (s == '.') {
                    if (isCloud) {
                        move++;
                        clouds[i][j] = move;
                    } else {
                        clouds[i][j] = -1;
                    }
                }
            }
        }

        for (int i = 1; i < clouds.length; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < clouds[i].length; j++) {
                sb.append(clouds[i][j]);
                if (j < clouds[i].length) {
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }

    }
}

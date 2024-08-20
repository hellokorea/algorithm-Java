package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2_2675_문자열반복 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            sb = new StringBuilder();

            for (int j = 0; j < S.length(); j++) {
                char s = S.charAt(j);

                for (int k = 0; k < R; k++) {
                    sb.append(s);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
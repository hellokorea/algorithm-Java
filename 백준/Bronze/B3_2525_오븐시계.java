package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_2525_오븐시계 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int time = Integer.parseInt(st.nextToken());

        //

        M += time;

        if (M >= 60) {
            H += M / 60;
            M %= 60;
        }

        if (H >= 24) {
            H %= 24;
        }

        System.out.println(H + " " + M);
    }
}

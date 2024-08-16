package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1_1546_평균 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        double max = 0;

        double[] scores = new double[N];

        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());

            if (scores[i] > max) {
                max = scores[i];
            }
        }

        double avg = 0;

        for (int i = 0; i < scores.length; i++) {
            avg += scores[i] / max * 100;
        }

        System.out.println(avg / N);
    }
}

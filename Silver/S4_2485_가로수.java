package Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S4_2485_가로수 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] pos = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            pos[i] = Integer.parseInt(st.nextToken());
        }

        int[] gaps = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            gaps[i] = pos[i + 1] - pos[i];
        }

        int gapValues = gaps[0];
        for (int i = 0; i < gaps.length; i++) {
            gapValues = gcd(gapValues, gaps[i]);
        }

        int count = 0;
        for (int gap : gaps) {
            count += (gap / gapValues) - 1;
        }

        System.out.println(count);

    }

    public static int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
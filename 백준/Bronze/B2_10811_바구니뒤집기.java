package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2_10811_바구니뒤집기 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] bucket = new int[N + 1];

        for (int i = 1; i <= bucket.length - 1; i++) {
            bucket[i] = i;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            while (start <= end) {

                if (start == end) {
                    break;
                }

                int temp = bucket[end];
                bucket[end] = bucket[start];
                bucket[start] = temp;
                start++;
                end--;
            }
        }

        for (int i = 1; i <= bucket.length - 1; i++) {
            sb.append(bucket[i]).append(" ");
        }

        System.out.println(sb.toString());
    }
}

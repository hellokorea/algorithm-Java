package Seed;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10807_개수세기 {
    static int N, V, count;
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        // Input
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        V = Integer.parseInt(br.readLine());

        // ^ Solution
        for (int i = 0; i < N; i++) {
            if (arr[i] == V) {
                count++;
            }
        }
        System.out.println(count);
    }

}

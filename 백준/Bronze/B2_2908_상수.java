package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2_2908_상수 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        int reverseA = Integer.parseInt(new StringBuilder(A).reverse().toString());
        int reverseB = Integer.parseInt(new StringBuilder(B).reverse().toString());

        int max = reverseA > reverseB ? reverseA : reverseB;

        System.out.println(max);
    }
}

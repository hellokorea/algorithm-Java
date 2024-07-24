package Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class S5_11651_좌표정렬하기2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt((br.readLine()));

        StringTokenizer st;

        List<Point> points = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            points.add(new Point(x, y));
        }

        points.sort((p1, p2) -> {
            if (p1.y != p2.y) {
                return Integer.compare(p1.y, p2.y);
            } else {
                return Integer.compare(p1.x, p2.x);
            }

        });

        for (Point point : points) {
            System.out.println(point.x + " " + point.y);
        }
    }
}

package 프로그래머스.멀티캠퍼스_코딩특강._3번문제;

import java.util.*;

public class _03_호텔대실 {

    public static void main(String[] args) {
        String[][] t1 = { { "15:00", "17:00" }, { "16:40", "18:20" }, { "14:20", "15:20" }, { "14:10", "19:20" },
                { "18:20", "21:20" } };

        int result = solution(t1);
        System.out.println(result);
    }

    // ^
    static int ttm(String time) {
        String[] hm = time.split(":");
        int h = Integer.parseInt(hm[0]);
        int m = Integer.parseInt(hm[1]);

        return h * 60 + m;
    }

    static int solution(String[][] book_time) {
        int answer = 0;

        List<int[]> rooms = new ArrayList<>();

        for (String[] times : book_time) {
            String start = times[0];
            String end = times[1];

            rooms.add(new int[] { ttm(start), 1 });
            rooms.add(new int[] { ttm(end) + 10, -1 });
        }

        Collections.sort(rooms, (t1, t2) -> t1[0] == t2[0] ? t1[1] - t2[1] : t1[0] - t2[0]);

        int roomCount = 0;

        for (int[] room : rooms) {
            int io = room[1];
            roomCount += io;

            answer = Math.max(answer, roomCount);
        }

        return answer;
    }
}

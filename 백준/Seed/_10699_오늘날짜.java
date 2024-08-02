package Seed;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _10699_오늘날짜 {

    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String formatDate = formatter.format(now);

        System.out.println(formatDate);
    }
}

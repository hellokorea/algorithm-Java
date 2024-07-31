package Bronze;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("test");

        List<Integer> list = new ArrayList<>();

        list.add(10);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list);
    }
}
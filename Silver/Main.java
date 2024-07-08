package Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("이름을 입력해주세요");

        String name = br.readLine();
        System.out.print("당신의 이름: " + name);

        System.err.println("error!");
    }
}
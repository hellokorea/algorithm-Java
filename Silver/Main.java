package Silver;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main throws IOException{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));	
    System.out.print("이름을 입력해주세요");
    
    try {
        String name = br.readLine();
        System.out.print("당신의 이름: " + name);
    } catch(IOException e) {
        System.err.println("error!");
    }

}
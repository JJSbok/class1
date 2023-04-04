package chapterTest.test10;

import java.util.Scanner;

public class Birthday {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("태어난 년도를 입력하세요 : ");

	String d = sc.next();
	sc.close();
    try {
        int intD = Integer.parseInt(d);
        System.out.println(intD);
    } catch (Exception e) {
        System.out.println("숫자를 입력해야 합니다.");
       return ;
    }
    System.out.println("태어난 년도 : " +d);
    
}
}

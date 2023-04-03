package chapter09;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate now = LocalDate.now();
		System.out.println(now);
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getMonth());
		System.out.println(now.getYear());
		
		LocalDate nextDay1 = now.plusDays(1);
		System.out.println(nextDay1);
		LocalDate nextDay2 =now.plusMonths(1);
		System.out.println(nextDay2);
		
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2);
		
	}

}

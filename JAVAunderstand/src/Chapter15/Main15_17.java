package Chapter15;

import java.time.LocalDate;
import java.time.Period;

public class Main15_17 {
	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(2020,  1, 1);
		LocalDate d2 = LocalDate.of(2020, 1, 4);
		
		Period p1 = Period.ofDays(3);
		Period p2 = Period.between(d1, d2);
		 System.out.println(p2);
	}
}

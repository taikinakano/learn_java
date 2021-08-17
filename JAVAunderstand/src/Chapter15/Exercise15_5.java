package Chapter15;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise15_5 {
	public static void main(String[] args) {
	LocalDateTime now = LocalDateTime.now();
	LocalDateTime future = now.plusDays(100);
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
	System.out.println(future.format(fmt));
	}
}

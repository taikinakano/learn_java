package Chapter15;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise15_4 {
	public static void main(String[] args) {
		Date now = new Date();
		Calendar c = Calendar.getInstance();
	    c.setTime(now);
	    int y = c.get(Calendar.DAY_OF_MONTH);
	    y += 100;
	    c.set(Calendar.DAY_OF_MONTH, y);
	    Date future = c.getTime();
	    SimpleDateFormat f = new SimpleDateFormat("西暦yyy年MM月dd日");
	    System.out.println(f.format(future));
	}
}

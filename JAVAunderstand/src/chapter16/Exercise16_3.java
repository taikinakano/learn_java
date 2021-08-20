package chapter16;
import java.util.HashMap;
import java.util.Map;

public class Exercise16_3 {
	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("斉藤", 3);
		prefs.put("鈴木", 7);
		int saito = prefs.get("斉藤");
		int suzuki = prefs.get("鈴木");
		System.out.println("斎藤が倒した数　＝" + saito);
		System.out.println("鈴木が倒した数　＝" + suzuki);
	}
}


public class Swich {
	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(4);
		switch (fortune) {
		 case 1:
		  System.out.println("大吉");
		  break;
		 case 2:
		  System.out.println("中吉");
		  break;
		 case 3:
		  System.out.println("吉");
		  break;
		 default:
		  System.out.println("凶");
		}
		System.out.println("あなたの運勢を占います");
		int fortunes = new java.util.Random().nextInt(5) + 1;
		switch (fortune) {
		 case 1:
		  System.out.println("大吉");
		  break;
		 case 2:
		  System.out.println("中吉");
		  break;
		 case 3:
		  System.out.println("吉");
		  break;
		 default:
		  System.out.println("凶");
		}
	}
}

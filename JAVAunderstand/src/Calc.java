
public class Calc {
	public static void main (String[] args) {
		int a = 10; int b = 2;
		int total = CalclLogic.tasu(a, b);
		int delta = CalclLogic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}
}

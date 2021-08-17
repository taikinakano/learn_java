package Chapter15;

public class Main15_33 {
	public static void main(String[] args) {
	String a = ".*";
	String b = "A¥d{1,2}";
	String c = "U[A-Z]{3}";
	
	System.out.println("ABC".matches(a));
	System.out.println(("A" + 2).matches(b));
	System.out.println("UAA3".matches(c));
	}
	
}

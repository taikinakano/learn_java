package Chapter15;

public class Main15_8 {
	public static void main(String[] args) {
		String s = "abc,def:fhi";
		String w = s.replaceAll("[beh]","x");
		System.out.println(w);
	}
}

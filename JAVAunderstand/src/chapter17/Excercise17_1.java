package chapter17;

public class Excercise17_1 {
	public static void main(String[] args) {
		try {
			String s = null;
		    System.out.println(s.length());
		} catch(NullPointerException e) {
			System.out.println("書き込みが失敗したよ"); 
			System.out.println("---スタックトレース（ここから）ーー");
			e.printStackTrace();
			System.out.println("---スタックトレース（ここまで）ーーー");
		}
	}
}

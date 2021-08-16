package Chapter14;

public class Main14＿6 {
	public static void main(String[] args) {
		Empty h1 = new Empty();
		h1.name = "ミナト";
		h1.hp = 100;
		Empty h2 = new Empty();
		h2.name = "ミナト";
		h2.hp = 100;
		if (h1.equals(h2) == true) {
			System.out.println("同じ内容です");
		}else {
			System.out.println("違う内容です");
		}
	}
}

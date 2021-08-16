package Chapter14;

public class chapter14_10 {
	public static void main(String[] args) {
		Empty h1 = new Empty();
		Empty h2 = new Empty();
		System.out.println(h1.hp);
		System.out.println(Empty.money);
		h1.money += 100;
		h2.money -= 10;
		System.out.println(Empty.money);
	}
}

package Chapter10;

public class Matango {
	int hp;
	final int LEVEL = 10;
	char suffix;
	public void run() {
		System.out.println("おばけきのこ" + this.suffix + "は逃げ出した!");
	}
	public void attack() {
		System.out.println("おばけキノコの攻撃:自爆");
		this.hp -= 10;
		System.out.println(this.hp);
	}
}

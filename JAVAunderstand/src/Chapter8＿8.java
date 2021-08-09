
public class Chapter8＿8 {
	String name;
	int hp;
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は。眠って回復した！");
		System.out.println(hp);
	}
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は。" + sec + "秒座った");
		System.out.println("HPが" + sec + "ポイント回復した");
		System.out.println(hp);
	}
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は。転んだ！");
		System.out.println("5のダメージ！");
		System.out.println(hp);
	}
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEORVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
}

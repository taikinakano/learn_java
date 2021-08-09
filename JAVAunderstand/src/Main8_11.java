
public class Main8_11 {
	public static void main(String[] args) {
		Chapter8＿8 h =new Chapter8＿8();
		h.name = "ミナト";
		h.hp = 100;
		
		Matango ml = new Matango();
		ml.hp = 50;
		ml.suffix = 'A';
		
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		//冒険の始まり
		m2.attack();
		h.slip();
		ml.run();
		m2.run();
		h.run();
	}
}

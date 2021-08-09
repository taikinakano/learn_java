package Clergyman;

public class Execise8_4 {
	public static void main(String[] args) {
		Cleric c = new Cleric();
		c.name = "クレック";
		c.hp = 10;
		c.mp = 1;
		
		c.pray(3);
		c.selfAid();
	}
}

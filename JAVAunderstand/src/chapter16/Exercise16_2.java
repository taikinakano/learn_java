package chapter16;
import java.util.ArrayList;


public class Exercise16_2 {
	public static void main(String[] args) {
		class Hero {
			private String name;
			public Hero(String name) {this.name = name; }
			public String getName() { return this.name; }
		}		
		Hero h1 = new Hero("斉藤");
		Hero h2 = new Hero("鈴木");
		ArrayList<Hero> hero = new ArrayList<Hero>();
		hero.add(h1);
		hero.add(h2);
		for (Hero h : hero) {
			System.out.println(h.getName());
		}
	}
}

package Chapter13;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	public void heal(Hero h) {
		int basePoint = 10;
		int recoverPoint = (int) (basePoint * this.getWand().getpower());
		h.setHp(h.getHp() + recoverPoint);
		System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した！");
	}
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		if (hp < 0) {
			this.hp = 0;
		}
		this.hp = hp;
	}
	public int getMp() {
		return this.mp;
	}
	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentexception("mpの値が正しくありません")
		}
		this.mp = mp;
	}
	public String getName() {
		if {name == null || name.length() < 3) {
			throw new IllegalArgumentexception("魔法使いに設定しようとしている名前が異常です")
		}
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Wand getWand() {
		return this.wand;
	}
	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IlligalArgumentException("設定されようとしている杖がnullです");
		}
		this.wand = wand;
	}
}

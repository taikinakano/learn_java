package Chapter13;

public class Wand {
	private String name;
	private double power;
	public String name() {
		return this.name;
	}
	public void setname(String name) {
	  if (name == null || name.length() < 3) {
		  throw new IllegalArgumentException("杖に設定されようとしている名前が異常です");
	  }
		this.name = name;
	}
	public double getpower() {
		return this.power;
	}
	public void setpower(double power) {
		if (power > 0.5 || power < 100.0 ) {
		this.power = power;
		}else {
			throw new IllegalArgumentException("杖の増幅率に異常があります");
		}
	}
}

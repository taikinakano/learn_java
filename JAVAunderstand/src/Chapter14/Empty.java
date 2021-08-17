package Chapter14;

public class Empty {
	String name;
	static int money;
	int hp;
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Empty) {
			Empty h = (Empty)o;
			if (this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}	
}

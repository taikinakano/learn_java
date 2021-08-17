package Chapter15;

public class Main15_6 {
	public boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
}

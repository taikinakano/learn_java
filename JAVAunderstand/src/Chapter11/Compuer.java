package Chapter11;

public class Compuer extends TangibleAsset {
	String makerName;
	public Compuer
	(String name, int price, String color, String makerName){
		super(name, price, color);
		this.makerName = makerName;
	}
	public String getMakeerName() { return this.makerName; }
}

package Chapter12;

public class Excercis12_2 {
	public static void main(String[] args) {
		Y y1 = new A();
		Y y2 = new B();
		y1.a();
		y2.a();
		Y[] array = new Y[2];
		array[0] = new A();
		array[1] = new B();
		for (Y y: array) {
			y.b();
		}
	}
}

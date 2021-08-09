
public class Chapter5_3 {
	public static void calcTriangleArea(double bottom, double height) {
		System.out.println("三角形の底辺は" + bottom);
		System.out.println("三角形の高さは" + height);
		double area = bottom * height;
		System.out.println(area);
	}
	public static void calcCircleAlrea(double roudius) {
		double Clarea = roudius * roudius; 
		System.out.println(Clarea);
	}
	
	public static void main(String[] args) {
		double bottom = 5;
		double height = 3;
		calcTriangleArea(bottom, height);
		double roudius = 3;
		calcCircleAlrea(roudius);
	}
}

package chapter17;
import java.io.FileWriter;

public class Main17_3 {
	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("data.txt");) {
			fw.write("hello!");
		} catch (Exception e) {
			System.out.println("何らかの例外は発生しました");
		}
	}
}


public class Chapter5＿3 {
	public static void email(String address, String text) {
		System.out.println(address + "二以下のメールを送信しました。");
		System.out.println("本文：" + text);
	}
	public static void main(String[] args) {
		String address = "add@addd";
		System.out.println("件名：無題");
		String text = "今夜のみに行きませんか";
		email(address, text);
	}
}

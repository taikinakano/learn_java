
public class InstructionExection {
	public static void main(String[] arge) {
		String name = "すがわら";
		String message;
		message = name + "さん、こんにちは";
		System.out.println(message);
		String rename = "すがわら";
		System.out.print("私の名前は");
		System.out.print(rename);
		System.out.print("です");
		int a = 5;
		int b = 3;
		int m = Math.max(a, b);
		System.out.println("比較実験:" + a + "と" + b + "とで大きい方は・・・" + m);
		String age = "31";
		int n = Integer.parseInt(age);
		System.out.println("あなたは来年、" + (n + 1) + "歳になりますね。");
	}
}

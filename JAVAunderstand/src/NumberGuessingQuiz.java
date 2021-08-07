
public class NumberGuessingQuiz {
	public static void main(String[] args) {
		int[] number = {3, 4, 9};
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int value: number) {
			if (input == value) {
				System.out.println("あたり");
			}else {
				System.out.println("ハズレ");
			}
		}
	}
}

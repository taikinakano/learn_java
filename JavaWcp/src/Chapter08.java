
public class Chapter08 extends Recursive01 {

	public static void main(String[] args) {
		int number = 1;
		while (number <= 5) {
			System.out.println("Recursive01=" + (number * number));
			number += 1;
		}
        int array[] = { 1, 4, 14, 25 };
        for (int i = 0; i < array.length; i++) {     	
            System.out.println(array[i]);
        }
        
        for (int val : array) {
            if (val % 2 == 0) {
                continue;
            }
            System.out.println(val);
        }
}
}


public class variable4 {
	public static void main(String[] args) {
		int[] seq = new int[10];
		
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}
		
		for (int i = 0; i < seq.length; i++) {
          char[] base = {'A', 'T', 'C', 'G'};
          System.out.println(base[seq[i]] + "");
		}
	}
}

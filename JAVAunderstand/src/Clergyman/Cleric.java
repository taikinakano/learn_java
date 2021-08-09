package Clergyman;

public class Cleric {
		String name;
		int hp = 50;
		final int mxhp = 50;
		int mp = 10;
		final int mxmp = 10;
		
		public void selfAid() {
		  System.out.println(this.name + "はセルフエイドを唱えた！");
		  this.hp = this.mxhp;
		  this.mp -= 5;
		  System.out.println("HPが最大まで回復した");
		}
		
		public int pray(int sec) {
			System.out.println(this.name + "は" + sec + "秒間天に祈った！");
			int r = new java.util.Random().nextInt(3) + sec;
			int recoverActual = Math.min(this.mxmp - this.mp, r);
			
			this.mp += recoverActual;
			System.out.println("MPが" + recoverActual + "回復した");
			return recoverActual;
		}
}

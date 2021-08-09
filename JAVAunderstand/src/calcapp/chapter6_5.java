package calcapp;
import calcapp.logics.CalcLogic;

public class chapter6_5 {
	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = CalcLogic.tasu(a,b);
		int delta = CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}
}

import java.util.Scanner;

public class Op {

	public static void main(String[] args) {
		int hap;
		
		hap = plus(100, 200);
		System.out.println(hap);
	}

	private static int plus(int num1, int num2) {
		int result;
		result = num1 + num2;
		
		return result;
	}
}

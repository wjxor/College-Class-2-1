import java.util.Scanner;

public class Op {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, j, num;
		num = sc.nextInt();
		
		i = (num - 1) / 4;
		j = (num - 1) % 4;
		
		System.out.print("(" + i + "," + j + ")");
	}
}

import java.util.Scanner;

public class Op {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i, j, num;
		i = sc.nextInt();
		j = sc.nextInt();
		
		num = i * 4 + j + 1;
		
		System.out.print(num);
	}
}

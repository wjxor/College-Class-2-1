import java.util.Scanner;

public class Op {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);

		// next()로 문자열을 입력받아서 charAt(0) 0인 곳부터 데려와라!
		char a = sc.next().charAt(0);
	
		num = (int) a;
		
		System.out.printf("%d", num);
		
		sc.close();
		
	}

}

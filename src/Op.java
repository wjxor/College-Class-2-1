import java.io.File;
import java.util.Scanner;

public class Op {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("C:/temp/a.txt"));

		int hap = 0;

		while (sc.hasNextLine())
			hap += sc.nextInt();

		System.out.println("합계 : " + hap);
		sc.close();

	}
}

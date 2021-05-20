import java.io.FileInputStream;

public class Op {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:/temp/a.txt");
		
		int ch;
		
		while ((ch = fis.read()) != -1) {
			System.out.print((char) ch);
		}
		
		fis.close();
		
	}
}

//using scanner class
import java.io.File;
import java.util.Scanner;

public class File1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\User\\Desktop\\TYSS\\assgn1.txt");
		Scanner s = new Scanner(file);
		while(s.hasNextLine())
		{
			System.out.println(s.nextLine());
		}
	}
}

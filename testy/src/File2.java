import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class File2 {
	public static void main(String[] args) throws Exception {
		File file = new File("./Data/assgn1.txt");
		BufferedReader brdr = new BufferedReader(new FileReader(file));
		FileWriter fw = new FileWriter("./Data/fw.txt");
		BufferedWriter bwr = new BufferedWriter(fw);
		String str="";	
		while((str=brdr.readLine())!=null)
		{
			System.out.println(str);
			fw.flush();
			fw.write(str);
			bwr.newLine();
		}	
		brdr.close();
		fw.close();
	}
}

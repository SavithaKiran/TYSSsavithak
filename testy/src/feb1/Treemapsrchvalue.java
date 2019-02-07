package feb1;

import java.util.Scanner;
import java.util.TreeMap;

public class Treemapsrchvalue {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		String value = sc.next();
		TreeMap<Integer, String> tmap = new TreeMap<>();
		tmap.put(4, "Threads");
		tmap.put(1, "Strings");
		tmap.put(3, "Collections");
		tmap.put(5, "Arrays");
		tmap.put(2, "Files");
		if(tmap.containsValue(value))
		{
			  System.out.println("Treemap contains the value: "+value);
		  }
		  else
			  System.out.println("Treemap does not contain the entered value");
		}

	}



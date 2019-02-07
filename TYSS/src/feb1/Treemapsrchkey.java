package feb1;

import java.util.Scanner;
import java.util.TreeMap;

public class Treemapsrchkey {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the key");
		int key = sc.nextInt();
		TreeMap<Integer, String> tmap = new TreeMap<>();
		tmap.put(4, "Threads");
		tmap.put(1, "Strings");
		tmap.put(3, "Collections");
		tmap.put(5, "Arrays");
		tmap.put(2, "Files");
		if(tmap.containsKey(key))
		{
			  System.out.println("Treemap contains the key: "+key);
		  }
		  else
			  System.out.println("Treemap does not contain the entered key");
		}

	}


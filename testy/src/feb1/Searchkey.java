package feb1;

import java.util.HashMap;
import java.util.Scanner;

public class Searchkey {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the key");
		int key = sc.nextInt();
		HashMap<Integer, String> tmap = new HashMap<>();
		tmap.put(1, "number");
		tmap.put(2, "character");
		tmap.put(3, "true");
		tmap.put(4, "false");
		tmap.put(5, "float");
		if(tmap.containsKey(key))
		{
			  System.out.println("Hashmap contains the key: "+key);
		  }
		  else
			  System.out.println("Hashmap does not contain the entered key");
		}
	}



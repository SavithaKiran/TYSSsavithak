package feb1;

import java.util.HashMap;
import java.util.Scanner;

public class Hashmapsrchvalue {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the value");
		String value = sc.next();
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(1, "number");
		hmap.put(2, "character");
		hmap.put(3, "true");
		hmap.put(4, "false");
		hmap.put(5, "float");
		if(hmap.containsValue(value))
		{
			System.out.println("Hashmap contains the given value");
		}
		else
			System.out.println("Hashmap doesnt contain the given value");

	}

}

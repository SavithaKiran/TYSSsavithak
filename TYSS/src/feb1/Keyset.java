package feb1;

import java.util.HashMap;

public class Keyset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(1, "letters");
		hmap.put(2, "indentifiers");
		hmap.put(3, "variables");
		hmap.put(4, "separators");
		System.out.println("Keyset is: "+hmap.keySet());

	}

}

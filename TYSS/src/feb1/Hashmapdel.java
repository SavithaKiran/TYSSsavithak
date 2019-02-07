package feb1;

import java.util.HashMap;

public class Hashmapdel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(1, "letters");
		hmap.put(2, "indentifiers");
		hmap.put(3, "variables");
		hmap.put(4, "separators");
		System.out.println("Before deleting Elements: "+hmap);
		hmap.clear();
		System.out.println("After deleting all Elements: "+hmap);
	}

}

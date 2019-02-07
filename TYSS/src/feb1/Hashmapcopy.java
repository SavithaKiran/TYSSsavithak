package feb1;

import java.util.HashMap;

public class Hashmapcopy {
	public static void main(String[] args) {
	HashMap<Integer, String> tmap = new HashMap<>();
	tmap.put(1, "number");
	tmap.put(2, "character");
	tmap.put(3, "true");
	tmap.put(4, "false");
	tmap.put(5, "float");
	HashMap<Integer, String> tmap1 = new HashMap<>();
	System.out.println("Hashmap: "+tmap);
	tmap1.putAll(tmap);
	System.out.println("copy of Hashmap: "+tmap1);
}
}
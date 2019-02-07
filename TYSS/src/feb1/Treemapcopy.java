package feb1;

import java.util.TreeMap;

public class Treemapcopy {
	public static void main(String[] args) {
		TreeMap<Integer, String> tmap = new TreeMap<>();
		tmap.put(1, "number");
		tmap.put(2, "character");
		tmap.put(3, "true");
		tmap.put(4, "false");
		tmap.put(5, "float");
		TreeMap<Integer, String> tmap1 = new TreeMap<>();
		System.out.println("treemap: "+tmap);
		tmap1.putAll(tmap);
		System.out.println("copy of treemap: "+tmap1);

	}

}

package feb1;

import java.util.TreeMap;

public class Treesubmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tmap = new TreeMap<>();
		tmap.put(4, "Threads");
		tmap.put(1, "Strings");
		tmap.put(3, "Collections");
		tmap.put(5, "Arrays");
		tmap.put(2, "Files");
		System.out.println("Submap of the Treemap is: "+tmap.subMap(2, 5));
	}

}

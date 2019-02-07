package feb1;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class ReverseTreemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> tmap = new TreeMap<>(Collections.reverseOrder());
		tmap.put(4, "Threads");
		tmap.put(1, "Strings");
		tmap.put(3, "Collections");
		tmap.put(5, "Arrays");
		tmap.put(2, "Files");
		System.out.println("Reversed Treemap is: "+tmap);
	}

}

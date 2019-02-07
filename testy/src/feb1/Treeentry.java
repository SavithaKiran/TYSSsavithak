package feb1;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Treeentry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tmap = new TreeMap<>();
		tmap.put(4, "Threads");
		tmap.put(1, "Strings");
		tmap.put(3, "Collections");
		tmap.put(5, "Arrays");
		tmap.put(2, "Files");
		System.out.println("The Entry Set is:");
		Set<Entry<Integer,String>> ent = tmap.entrySet();
		for(Entry<Integer,String> e:ent)
		{ 
        System.out.println(e.getKey()+" = "+e.getValue());
		}

	}

}

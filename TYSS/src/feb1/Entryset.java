package feb1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Entryset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(1, "letters");
		hmap.put(2, "indentifiers");
		hmap.put(3, "variables");
		hmap.put(4, "separators");
		System.out.println("The Entry Set is:");
		Set<Entry<Integer,String>> ent = hmap.entrySet();
		for(Entry<Integer,String> e:ent)
		{ 
        System.out.println(e.getKey()+" = "+e.getValue());
		}

	}

}

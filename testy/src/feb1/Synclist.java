package feb1;

import java.util.ArrayList;
import java.util.Collections;

public class Synclist {
	public static void main(String[] args) {
	     ArrayList<String> al = new ArrayList<>();
	     al.add("Aadya");
	     al.add("Trishi");
	     al.add("Savitha");
	     al.add("Shwetha");
	     al.add("Prema");
	     al.add("Girish");
	     System.out.println("Synchronized list is: "+Collections.synchronizedList(al));
	     System.out.println("Maximum element in the list is: "+Collections.max(al));
	}

}

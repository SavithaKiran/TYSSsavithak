package feb1;

import java.util.ArrayList;
import java.util.Collections;

public class Swaplist {
	public static void main(String[] args) {
		 ArrayList<String> al = new ArrayList<>();
	     al.add("Aadya");
	     al.add("Trishi");
	     al.add("Savitha");
	     al.add("Shwetha");
	     al.add("Prema");
	     al.add("Girish");
	     System.out.println(al);
	     Collections.swap(al, 2, 5);
	     System.out.println("Swapped list is: "+al);
	}

}

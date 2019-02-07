package feb1;

import java.util.ArrayList;
import java.util.List;

public class Sublist {
public static void main(String[] args) {
	 ArrayList<String> al = new ArrayList<>();
     al.add("Aadya");
     al.add("Trishi");
     al.add("Savitha");
     al.add("Shwetha");
     al.add("Prema");
     al.add("Girish");
     System.out.println(al);
     List<String> sub = al.subList(1, 5);
     System.out.println("Sublist is: "+sub);
}
}

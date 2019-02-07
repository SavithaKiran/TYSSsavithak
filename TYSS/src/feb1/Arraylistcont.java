package feb1;

import java.util.ArrayList;
import java.util.List;

public class Arraylistcont {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			     ArrayList<String> al = new ArrayList<>();
			     al.add("Aadya");
			     al.add("Trishi");
			     al.add("Savitha");
			     al.add("Shwetha");
			     al.add("Prema");
			     al.add("Girish");
			     List<String> list = new ArrayList<String>();
			     list.add("Aadya");
			     list.add("Trishi");
			     System.out.println(al.containsAll(list));
			     list.add("sweet");
			     System.out.println(al.contains(list));
			}

		}

	



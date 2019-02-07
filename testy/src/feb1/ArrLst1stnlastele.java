package feb1;

import java.util.Collections;
import java.util.LinkedList;

public class ArrLst1stnlastele {
	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<>();
		link.add("static");
		link.add("class");
		link.add("method");
		link.add("instance");
		Collections.sort(link);
		System.out.println("First element in the list is: "+link.pollFirst());
		System.out.println("Last element in the list is: "+link.pollLast());
	}

}

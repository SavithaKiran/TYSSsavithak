package feb1;

import java.util.ArrayList;

public class Arraylsttoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("Selenium");
		al.add("Python");
		al.add("Automation");
		al.add("Manual");
	    Object[] arr = al.toArray();
	    for(int i=0;i<arr.length;i++) {
	    System.out.println(arr[i]);
	    }

	}

}

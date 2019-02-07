package feb1;

import java.util.Collections;
import java.util.HashSet;


public class Syncset {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hset = new HashSet<String>();
		hset.add("Abstraction");
		hset.add("Inheritance");
		hset.add("Polymorphism");
		hset.add("Java");
		System.out.println("Synchronised set is: "+Collections.synchronizedSet(hset));
	}
}

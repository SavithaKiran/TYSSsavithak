package feb1;

import java.util.TreeSet;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> hset = new TreeSet<String>();
		hset.add("Abstraction");
		hset.add("Inheritance");
		hset.add("Polymorphism");
		hset.add("Java");
		System.out.println(hset);
		System.out.println("Subset from the sorted set is: "+hset.subSet("Abstraction", "Java"));

	}

}

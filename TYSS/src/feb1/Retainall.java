package feb1;

import java.util.HashSet;

public class Retainall {
	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		hset.add("Abstraction");
		hset.add("Inheritance");
		hset.add("Polymorphism");
		hset.add("Java");
		System.out.println("1st Hash set is:"+ hset);
		HashSet<String> hset2 = new HashSet<>();
		hset2.add("static");
		hset2.add("class");
		hset2.add("Java");
		hset2.add("instance");
		System.out.println("2nd Hash set is:"+ hset2);
		hset2.retainAll(hset);
		System.out.println("Elements in both hashset:"+hset2);
	}

}

package feb1;

import java.util.HashSet;

public class Hashsetcopy {
	public static void main(String[] args) {
			HashSet<String> hset = new HashSet<String>();
			hset.add("Abstraction");
			hset.add("Inheritance");
			hset.add("Polymorphism");
			hset.add("Java");
			HashSet<String> hset1 = new HashSet<>(hset);
			System.out.println(hset1);
			hset1.retainAll(hset);
			System.out.println(hset1);

		}
	}



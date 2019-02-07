package feb1;

import java.util.TreeSet;

public class Arraydup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= {"I","am","what","I","am"};//demo testing
		TreeSet<String> unique = new TreeSet<>();
		System.out.println("Duplicate Strings are ");
		for(String dups:arr) 
		{
			if(!unique.add(dups)) 
			{
				System.out.println(dups);//dgrsgrs
			}
		}
}
}
package feb1;

import java.util.ArrayList;

public class Arraylstcopy {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Savitha");
		al.add("Shwetha");
		al.add("girish");
		al.add("Prema");
		al.add("Gowri");
		ArrayList<String> copy = (ArrayList<String>)al.clone();
		System.out.println(copy);

	}

}

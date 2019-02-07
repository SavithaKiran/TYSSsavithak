import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Move1stto2nd {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = s.nextInt();
		swap(a);
	}
		public static void swap(int a)
		{
		  String num = Integer.toString(a);
		  String fhalf = num.substring(num.length()/2);
		  String shalf = num.substring(0,num.length()/2);
		  String revnum = fhalf+shalf;
		  int revnum1 = Integer.parseInt(revnum);
		  System.out.println(revnum1);
	}

}

import java.util.Scanner;

public class swapStrings 
	{
	public static void swap(String first,String second)
	{
		System.out.println(" Before Swap first="+first+" second="+second);
		first=first+second;
		second=first.substring(0,first.length()-second.length());
		first=first.substring(second.length());
		System.out.println(" After Swap first="+first+" second="+second);
	  
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first String:");
		String first=s.next();
		System.out.println("Enter the second string:");
		  String second=s.next();
		 swap(first,second);
		
		
	}
	

}

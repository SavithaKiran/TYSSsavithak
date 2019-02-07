import java.util.Scanner;

public class Strpalindrome {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
	    String str = s.next(),str2 = "";
		int strlnth = str.length();
		for(int i= strlnth-1; i>=0 ;i--)
		{
			str2 = str2+str.charAt(i);
		}
		if(str.equalsIgnoreCase(str2))
		{
			System.out.println("Given string is a palindrome");
		}
		else
		{
			System.out.println("Given string is not a palindrome");
		}
	}

}

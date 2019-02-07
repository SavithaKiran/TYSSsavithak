import java.util.Scanner;

public class Stranagram {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the first String: ");
		String str1 = s.next();
		System.out.println("Enter the second String: ");
		String str2 = s.next();
			int n1 = str1.length();
			int n2 = str2.length();
			int count =0, count1 = 0;
			if (n1==n2)
			{
				int n=n1;
			for(int i=0;i<n;i++)
			{
				count =0;
				for(int j=0;j<n;j++)
				{
				if(str1.charAt(i) == str2.charAt(j))
				{
					count++;
					break;
				}
				}
				if(count == 0)
				{
					count1 = 1;
					break;
				}
			}
				if(count1 ==1)
				{
					System.out.println("Given Strings are not Anagram");
				}
				else
					System.out.println("Given strings are Anagram");
			}		
		else
		System.out.println("Both the Strings must have same number of characters");
	}
}

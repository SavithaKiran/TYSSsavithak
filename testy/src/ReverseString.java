import java.util.Scanner;

public class ReverseString {
	static void reverseEachWordOfString(String string)
    {
        String[] words = string.split(" ");
        String reverseString = "";
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
            reverseString = reverseString + reverseWord + " ";
        }
        System.out.println(string);
        System.out.println(reverseString);
    }
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String string1 = s.next();
		reverseEachWordOfString(string1);
		
		
	}
}

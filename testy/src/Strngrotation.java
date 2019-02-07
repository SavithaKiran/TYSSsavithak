import java.util.Scanner;

public class Strngrotation {
	public static boolean areRotations(String str1, String str2) 
    { 
        return (str1.length() == str2.length()) &&  
               ((str1 + str1).contains(str2)); 
    } 
    @SuppressWarnings("resource")
	public static void main(String[] args) 
    { 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 1st String:");
        String str1 = s.nextLine();
        System.out.println("Enter the 2nd String: ");
        String str2 = s.nextLine();
        if (areRotations(str1, str2)) 
            System.out.println("Yes"); 
        else
            System.out.printf("No"); 
    } 
} 



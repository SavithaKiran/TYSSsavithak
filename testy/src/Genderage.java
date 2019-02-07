import java.util.Scanner;

public class Genderage {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Gender: ");
		String gender = s.next();
		System.out.println("Enter the Age: ");
		int age = s.nextInt();
		if(gender.equals("F") && age>=18)
		{
				System.out.println("Eligible for Marriage");
		}
		else if(gender.equals("M")&& age>=21)
		{
				System.out.println("Eligible for Marriage");
		}
		else
		{
			System.out.println("Not Eligible for Marriage");
		}
    }
}

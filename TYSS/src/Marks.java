import java.util.Scanner;

public class Marks {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int marks;
		System.out.println("Enter the marks: ");
		marks = s.nextInt();
		if (marks<35)
		{
			System.out.println("Failed");
		}
		else if(marks>=85)
		{
			System.out.println("Distinction");
		}
		else if(marks>60&&marks<85)
		{
			System.out.println("First Class");
		}
		else
		{
			System.out.println("Passed");
		}

	}

}

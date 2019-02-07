import java.util.Scanner;

public class Array1sthalfsum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = s.nextInt();
		int sum=0;
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Enter the value of arr["+i+"]");
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length/2;i++)
		{
			sum = sum+arr[i];
		}
		System.out.println("Sum of the 1st half of the elements is: "+sum);

	}

}

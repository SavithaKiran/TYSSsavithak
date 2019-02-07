import java.util.Scanner;

public class minevenin {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = s.nextInt();
		int min;
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Enter the value of arr["+i+"]");
			arr[i]=s.nextInt();
		}
		min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
		if(i%2==0)
		{
			if(arr[i]<=min)
				min=arr[i];
		}
	   }
		System.out.println("Smallest number is "+min);
		
}
}

import java.util.Scanner;

public class Maxoddind {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the size of the array: ");
			int n = s.nextInt();
			int max;
			int arr[] = new int[n];
			for (int i = 0; i < arr.length; i++) 
			{
				System.out.println("Enter the value of arr["+i+"]");
				arr[i]=s.nextInt();
			}
			max=arr[0];
			for(int i=0;i<arr.length;i++)
			{
			if(i%2==1)
			{
				if(max<arr[i])
					max=arr[i];
			}
		   }
			System.out.println("Largest number is "+max);
			
	}
	}



import java.util.Scanner;

public class Oddindavg {
		@SuppressWarnings("resource")
		public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the size of the array: ");
				int n = s.nextInt();
				int sum=0,count=0;
				float avg;
				int arr[] = new int[n];
				for (int i = 0; i < arr.length; i++) 
				{
					System.out.println("Enter the value of arr["+i+"]");
					arr[i]=s.nextInt();
				}
				for(int i=0;i<arr.length;i++)
				{
				if(i%2==1)
				{
					count++;
					sum = sum+arr[i];
				}
			   }
				avg = (float)sum/count;
				System.out.println("Number of Odd indexed elements are: "+count );
				System.out.println("Sum of all Odd indexed elements is: "+sum);
				System.out.println("Average of the Odd indexed array is: "+avg);
				
		}
		}






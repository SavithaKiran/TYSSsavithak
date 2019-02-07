import java.util.Scanner;

public class Reverse1sthalf {

		static void reverse(int []a, int n, int k) 
	    { 
	        if (k > n) 
	        { 
	            System.out.println( "Invalid k");  
	        } 
	        for (int i = 0; i < k / 2; i++) 
	        { 
	            int tempswap = a[i];  
	                a[i] = a[k - i - 1];  
	                a[k - i - 1] = tempswap;              
	        }  
	    }
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the size of the Array:");
			int size = s.nextInt();
			int []a= new int[size];
		for (int i = 0; i < a.length; i++) 
			{
			  System.out.println("Enter the value ofa["+i+"]");
			  a[i] = s.nextInt();
		    } 
		System.out.println("Entered Array is:");
			for (int i = 0; i < a.length; i++) 
		  {
			System.out.println(a[i]);
		  }
			System.out.println("After reversing the 1st half of the Array:");
			reverse(a,size,size/2);
			for (int i = 0; i < a.length; i++) 
			  {
				System.out.print(a[i]+" ");
			  }
		}

	}



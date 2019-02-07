import java.util.Scanner;

public class Reverse2ndhalf {
	 static void reverse(int []a, int i,int j) 
	    { 
	    	if(i>j)
	    		return;
	    	else {
	            int tempswap = a[i];  
	                a[i] = a[j];  
	                a[j] = tempswap; 
	                reverse(a, ++i, --j);
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
		System.out.println("After reversing the 2nd half of the Array:");
		reverse(a,size/2,size-1);
		for (int i = 0; i < a.length; i++) 
		  {
			System.out.print(a[i]+" ");
		  }
	}

}

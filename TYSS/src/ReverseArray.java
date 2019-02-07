import java.util.Scanner;

public class ReverseArray {

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
	reverse(a, size); 
    for (int i = 0; i < size; ++i) 
        System.out.print(a[i] + " "); 
	}
	public static void displayArray(int []a)
	{
		for (int i = 0; i < a.length; i++) 
	  {
		System.out.println(a[i]);
	  }
	}
	static void reverse(int []a, int n) 
    { 
     
        for (int i = 0; i < n / 2; i++) 
        { 
            int tempswap = a[i];  
                a[i] = a[n - i - 1];  
                a[n - i - 1] = tempswap;              
        }  
    }

}


import java.util.Scanner;

//sum of the digits of a given number
public class Sumofdigits {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		int temp = num;
		int sum=0,n=0;
		while(num>0)
		{
			n=num%10;
	        sum=sum+n;
		    num=num/10;
		}
		System.out.println("The sum of the digits of "+temp+" is: "+sum);
	}
	

}

import java.util.Scanner;

public class Stringpermut {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next() ; 
        int n = str.length(); 
        Stringpermut permutation = new Stringpermut(); 
        permutation.permute(str, 0, n - 1); 

	}
	 public void permute(String str, int l, int r) 
	    { 
	        if (l == r) 
	            System.out.println(str); 
	        else { 
	            for (int i = l; i <= r; i++) { 
	                str = swap(str, l, i); 
	                permute(str, l + 1, r); 
	                str = swap(str, l, i); 
	            } 
	        } 
	    }
	 public String swap(String a, int i, int j) 
	    { 
	        char temp; 
	        char[] chArr = a.toCharArray(); 
	        temp = chArr[i]; 
	        chArr[i] = chArr[j]; 
	        chArr[j] = temp; 
	        return String.valueOf(chArr); 
	    } 

}

package feb5;

import java.time.LocalDate;

public class Addmmmyydd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("After 3 years from now the date will be :"+LocalDate.now().plusYears(3));
		System.out.println("After 6 months from now the date will be :"+LocalDate.now().plusMonths(6));
		System.out.println("After 20 days from now the date will be :"+LocalDate.now().plusDays(20));
		System.out.println("Before 3 years from now the date was :"+LocalDate.now().minusYears(3));
		System.out.println("Before 5 months from now the date was :"+LocalDate.now().minusMonths(5));
		System.out.println("Before 40 days from now the date was :"+LocalDate.now().minusDays(40));
		System.out.println("Total number of days in the year: "+LocalDate.now().lengthOfYear());
	}

}

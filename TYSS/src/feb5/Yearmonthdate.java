package feb5;

import java.time.LocalDate;

public class Yearmonthdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Current date is: "+ LocalDate.now());
		System.out.println("Year in the current date is: "+ LocalDate.now().getYear());
		System.out.println("Month in the current date is :"+ LocalDate.now().getMonth());
		System.out.println("Day in the current date is: "+ LocalDate.now().getDayOfMonth());
		int mv = LocalDate.now().getMonthValue();
		System.out.println(mv);
			}

}

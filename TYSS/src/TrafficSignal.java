import java.util.Scanner;

public class TrafficSignal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the signal color:");
		String sgnl = s.next();
		switch (sgnl) {
		case "Orange":
			System.out.println("Caution....");
			break;
		case "Yellow":
			System.out.println("Be Ready");
			break;
		case "Amber":
			System.out.println("Ready to stop");
			break;
		case "Red":
			System.out.println("Stop");
			break;
		case "Green":
			System.out.println("Go");
			break;
		default:
			System.out.println("Invalid Signal Color");
			break;
		}
	}

}

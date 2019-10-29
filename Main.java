import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Seconds since Unix Epoch: ");

		int in = scan.nextInt();

			// 60 seconds --> 60 minutes --> 24 hours --> 30 days (in a typical month) --> 12 months
		int year = 1970 + in / (60*60*24*30*12);
		int rem = in % (60*60*24*30*12); // Remainder

		// Months
		int month = rem / (60*60*24*30);
		rem = rem % (60*60*24*30); // New value calculated for rem

		// Days
		int day = rem % (60*60*24);
		rem = rem % (60*60*24);

		// Hours
		int hour = rem % (60*60);
		rem = rem % (60*60);

		// Minutes
		rem = rem % 60;

		// Seconds 
		rem = rem % 60;

		System.out.println(rem);
	}
}
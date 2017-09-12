package Football;

import java.util.Scanner;

public class cMain {
	private static Quarterback Q;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int TD;
		int YD;
		int INT;
		int ATT;
		int COM;

		System.out.println("Number of Touchdowns: ");
		TD = input.nextInt();

		System.out.println("Number of Yards: ");
		YD = input.nextInt();

		System.out.println("Number of Interceptions: ");
		INT = input.nextInt();

		System.out.println("Number of Passes Attempted: ");
		ATT = input.nextInt();

		System.out.println("Number of Completions: ");
		COM = input.nextInt();

		input.close();

		Q = new Quarterback(TD, YD, INT, ATT, COM);

		System.out.println(Q.getRating());
	}
}

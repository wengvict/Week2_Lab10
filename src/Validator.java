

import java.util.Scanner;

public class Validator {
	
	// prevents input mismatch and illegal argument
	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				if (d > 0) {
					isValid = true;
				} else {
					System.out.println("Radius can't be negative. Please try again: " + "\n");
				}
			} else {
				System.out.println("Radius must be a number. Please try again." + "\n");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return d;
	}
	
	public static String getString(Scanner sc, String prompt) {
		String s = "";
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNext()) {
				s = sc.next();
				if (s.contains("y") || s.contains("Y")) {
					isValid = true;
				} else if (s.contains("n") || s.contains("N")) {
					break;
				} else {
					System.out.print("\n" + "Please enter 'y' or 'n'. ");
				}
			} else {
				System.out.print("\n" + "Please enter 'y' or 'n': ");
			}
			sc.nextLine();
		}
		return s;
	}
}
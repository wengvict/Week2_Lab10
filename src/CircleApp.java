import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = 0;
		int circlesBuilt = 0;
		String userCont = "";
		
		System.out.println("Welcome to the Circe Tester!" + "\n");
		
		do {
			r = Validator.getDouble(scan, "Enter a radius: ");
			Circle circle = new Circle(r);
			
			System.out.println(circle.getFormattedCircumference(circle.getCircumference(r)));
			System.out.println(circle.getFormattedArea(circle.getArea(r)));
			circlesBuilt++;
			
			userCont = Validator.getString(scan, "Continue? (y/n) ");
			System.out.print("\n");
		
		} while (userCont.contains("y") || userCont.contains("Y"));
		
		System.out.println("You've built " + circlesBuilt + " circles. Goodbye.");
		scan.close();
	}
}


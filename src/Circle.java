import java.text.DecimalFormat;

public class Circle {
	
	public Circle(double radius) {
		
	}
	
	public double getCircumference(double radius) {
		return 2* Math.PI * radius;
		
	}
	
	public double getArea(double radius) {
		return Math.PI * (radius * radius);
	}
	
	private static double formatNumber(double x) {
		DecimalFormat twoD = new DecimalFormat("#.##");
		return Double.valueOf(twoD.format(x));
	}
	
	public String getFormattedCircumference(double d) {
		d = formatNumber(d);
		return "Circumference: " + d;
	}
	
	public String getFormattedArea(double d) {
		d = formatNumber(d);
		return "Area: " + d;
		
	}

}

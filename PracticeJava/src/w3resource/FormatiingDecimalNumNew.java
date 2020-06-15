package w3resource;

public class FormatiingDecimalNumNew {
	static final double PI = 3.14159265;

	public static void main(String[] args) {
		double radius = 12.67;
		double height = 12.00;
		
		System.out.println("Two decimal places:");
		System.out.printf("Line 9: radius = %.2f, height = %.2f, volume = %.2f, PI = %.2f", radius, height, PI * radius * radius * height, PI);
		
		System.out.println();
		System.out.println("Three decimal places:");
		System.out.printf("Line 11: radius = %.3f, height = %.3f, volume = %.3f, PI = %.3f", radius, height, PI * radius * radius * height, PI);
		
		System.out.println();
		System.out.println("Four decimal places:");
		System.out.printf("Line 13: radius = %.4f, height = %.4f, volume = %.4f, PI = %.4f", radius, height, PI * radius * radius * height, PI);
		
		System.out.println();
		System.out.printf("Line 14: radius = %.3f, height = %.2f, PI = %.5f", radius, height,PI);
	}

}

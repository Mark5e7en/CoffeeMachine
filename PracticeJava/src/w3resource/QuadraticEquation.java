package w3resource;

public class QuadraticEquation {
	
	public void solveQuadraticEquation(double a, double b, double c) {
		double x1, x2;
		double partial, partial1, partial2;
		
		partial = Math.sqrt((b*b) - 4*a*c);
		
		partial1 = -b + partial;
		partial2 = -b - partial;
		
		x1 = partial1 / (2 * a);
		
		x2 = partial2 / (2 * a);
		
		System.out.println("The roots are " + x1 + " and " + x2);
	}
	
}

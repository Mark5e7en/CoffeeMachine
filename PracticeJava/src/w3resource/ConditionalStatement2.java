package w3resource;

import java.util.Scanner;

public class ConditionalStatement2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		QuadraticEquation quadraticEquationObject = new QuadraticEquation();
		double a, b, c;
		
		System.out.print("Input a: ");
		a = input.nextDouble();
		
		System.out.print("Input b: ");
		b = input.nextDouble();
		
		System.out.print("Input c: ");
		c = input.nextDouble();
		
		quadraticEquationObject.solveQuadraticEquation(a, b, c);
		
		input.close();

	}

}

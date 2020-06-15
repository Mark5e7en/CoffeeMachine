package w3resource;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Input 1st integer: ");
		int int1 = input.nextInt();
		System.out.println("Input 2nd integer: ");
		int int2 = input.nextInt();
		
		int sum = int1 + int2;
		int difference = int1 - int2;
		int product = int1 * int2;
		double average = sum/2;
		int distance = int1 - int2;
		
		System.out.println("Sum of two integers: " + sum);
		System.out.println("Difference of two integers: " + difference);
		System.out.println("Product of two integers: " + product);
		System.out.println("Average of two integers: " + average);
		System.out.println("Distance of two integers: " + distance);
		
		if (int1 > int2) {
			System.out.println("Max integer: " +int1);
		} else {
			System.out.println("Max integer: " +int2);
		}
		
		if (int1 > int2) {
			System.out.println("Min integer: " +int2);
		} else {
			System.out.println("Min integer: " +int1);
		}
		
		input.close();
		
	}
	
	public static void showSum(String num1, String num2) {
		num1 = JOptionPane.showInputDialog("Input first number: ");
		num2 = JOptionPane.showInputDialog("Input second number: ");
		
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		
		int sum = n1 + n2;
		JOptionPane.showMessageDialog(null, "The sum is " +sum);
	}

}

package w3resource;

import java.util.Scanner;

public class DisplayGrade {
	
	static Scanner input = new Scanner(System.in);
	static final double PAY_RATE = 15.75;
	
	public static void main(String[] args) {
		int i;
		int num = 0;
		int sum = 0;
		double ave = 0.0;
		
		System.out.println("Input the 5 numbers: ");
		
		for(i = 0; i < 5; i++) {
			num = input.nextInt();
			sum += num;
			System.out.println("inside loop");
		}
		
		ave = sum / 5;
		
		System.out.println("The sum of 5 numbers is: " + sum + "\nThe Average is: " + ave);
		System.out.println("outside loop");
	}

}

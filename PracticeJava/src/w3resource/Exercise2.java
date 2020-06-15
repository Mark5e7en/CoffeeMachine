package w3resource;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("input first number: ");
		int num1 = input.nextInt();
		System.out.println("input second number: ");
		int num2 = input.nextInt();
		System.out.println("input third number: ");
		int num3 = input.nextInt();
		System.out.println("input fourth number: ");
		int num4 = input.nextInt();
		
		if (num1 == num2 && num2 == num3 && num3 == num4 && num4 == num1) {
			System.out.println("equal");
		} else {
			System.out.println("Numbers are not equal!");
		}
		
		input.close();
	}

}

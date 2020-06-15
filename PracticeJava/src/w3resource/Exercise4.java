package w3resource;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input six non-negative digits: ");
		int num = input.nextInt();
		
		String digit = String.valueOf(num);
		char fo[] = digit.toCharArray();
		
		for(int i=0; i<6; i++) {
			System.out.print(fo[i] + " ");
		}
		
		input.close();

	}

}

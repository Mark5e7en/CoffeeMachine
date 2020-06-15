package w3resource;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int fo[] = {1,2,3};
		int total = 0;
		int i = 0;
		
		
		for(i=0; i<fo.length; i++) {
			System.out.println("Input number: ");
			fo[i] = input.nextInt();
			
			total += fo[i];
		}
		
		System.out.println(total);
		input.close();
	}

}

package game;

import java.util.*;

public class BusTour {
	
	public static long power(int n, int m) {
		return (long) Math.pow(n, m);
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int busHeight = scanner.nextInt();
		int noOfBridges = scanner.nextInt();
		int a = -1;
		int bridgesHeight[] = new int[noOfBridges];
		boolean notCrash = false;
		
		for (int i = 0; i < noOfBridges; i++) {
			bridgesHeight[i] = scanner.nextInt();
			
			if (bridgesHeight[i] <= busHeight) {
				System.out.println("Will crash on bridge " + (i + 1));
				a = i;
				break;
			} else {
				notCrash = true;

			}
			
		}
		
		if (notCrash && a < 0) {
			System.out.println("Will not crash");
		}
		
		scanner.close();
		
		

	}

}

package game;

import java.util.Scanner;

public class CheerCreator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		int[] arr = new int[size];
		int n, m;
		boolean neverOccur = true;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();

		}
		
		n = scanner.nextInt();
		m = scanner.nextInt();
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == n && arr[i+1] == m) {
				neverOccur = false;
			}

		}
		
		System.out.println(neverOccur);
		
		scanner.close();
		
		

	}

}

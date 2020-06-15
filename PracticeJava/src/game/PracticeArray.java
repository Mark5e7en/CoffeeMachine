package game;

import java.util.Scanner;

public class PracticeArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] str = scanner.nextLine().split(" ");
		int size = str.length;
		int[] arr = new int [size];
		
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		int rotate = scanner.nextInt();
		
		rotate = rotate % size;
		
		for (int i = 0; i < rotate; i++) {
			int j, last;
			
			last = arr[arr.length-1];
			
			for (j = arr.length-1; j > 0; j--) {
				arr[j] = arr[j-1];
			}
			
			arr[0] = last;
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		scanner.close();

	}

}

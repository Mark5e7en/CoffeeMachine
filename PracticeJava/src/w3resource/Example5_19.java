package w3resource;

public class Example5_19 {

	public static void main(String[] args) {
		
		for (int i = 5; i >= 1; i--) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//printStars(5, 5);
		
		System.out.println("   *   ");
		System.out.println("  ***  ");
		System.out.println(" ***** ");
		System.out.println("*******");

	}
	
	public static void printStars(int blanks, int starsInLine) {
		int count;
		
		for (count = 1; count <= blanks; count++) {
			System.out.print(" ");
			
			for (count = 1; count <= starsInLine; count++) {
				System.out.print("*");
			}
		}
		
		System.out.println();
				
	}

}

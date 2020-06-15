package game;

import java.util.Arrays;
import java.util.Scanner;

public class Hi {
	
    static final int WATER = 200;
    static final int MILK = 50;
    static final int COFFEE_BEANS = 15;
	
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);

		System.out.println("Write how many ml of water the coffee machine has: ");
        int availableWater = scan.nextInt();
        
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int availableMilk = scan.nextInt();
        
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int availableCoffeeBeans = scan.nextInt();
        
        System.out.println("Write how many cups of coffee you will need: ");
        int cupsOfCoffee = scan.nextInt();
        
        int totalAvailableWater = availableWater / WATER;
        int totalAvailableMilk = availableMilk / MILK;
        int totalAvailableCoffeeBeans = availableCoffeeBeans / COFFEE_BEANS;
        int totalAvailableCupsOfCoffee = 0;
        
        int[] arr = {totalAvailableWater, totalAvailableMilk, totalAvailableCoffeeBeans};
        Arrays.sort(arr);
        totalAvailableCupsOfCoffee = arr[0];
       
        if (totalAvailableCupsOfCoffee >= cupsOfCoffee && totalAvailableCupsOfCoffee > 1) {
        	System.out.println("Yes, I can make that amount of coffee (and even " + (totalAvailableCupsOfCoffee - cupsOfCoffee) + " more than that)");
        } else if (totalAvailableCupsOfCoffee >= cupsOfCoffee && totalAvailableCupsOfCoffee == 1) {
        	System.out.println("Yes, I can make that amount of coffee");
        } else {
        	System.out.println("No, I can make only " + totalAvailableCupsOfCoffee + " cup(s) of coffee");
        }
        
        scan.close();

	}
}

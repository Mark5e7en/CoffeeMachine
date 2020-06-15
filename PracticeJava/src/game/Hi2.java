package game;

import java.util.Scanner;

public class Hi2 {
	
	static Scanner scanner = new Scanner(System.in);
	
	static final int ESPRESSO_WATER = 250;
	static final int ESPRESSO_COFFEEBEANS = 16;
	static final int ESPRESSO_COST = 4;
	
	static final int LATTE_WATER = 350;
	static final int LATTE_MILK = 75;
	static final int LATTE_COFFEEBEANS = 20;
	static final int LATTE_COST = 7;
	
	static final int CAPPUCCINO_WATER = 200;
	static final int CAPPUCCINO_MILK = 100;
	static final int CAPPUCCINO_COFFEEBEANS = 12;
	static final int CAPPUCCINO_COST = 6;

	static int water = 400;
	static int milk = 540;
	static int coffeeBeans = 120;
	static int cups = 9;
	static int money = 550;
	
	static String coffeeType;
	
	public static void main(String[] args) {	
		boolean state = true;
		
		while (state) {
			System.out.println("Write action (buy, fill, take, remaining, exit):");
			String action = scanner.nextLine();
			
			if (action.contains("buy")) {
				if (checkResources(water, milk, coffeeBeans, cups)) {
					buy(coffeeType);
				} else {
					System.out.println("Cannot make coffee");
				}	
			} else if (action.contains("fill")) {
				fill();
			} else if (action.contains("take")) {
				take();
			} else if (action.contains("remaining")) {
				printMachineState(water, milk, coffeeBeans, cups, money);
			} else if (action.contains("exit")) {
				state = false;
			} else {
				System.out.println("Not a valid action");
			}
		}
		
		scanner.close();

	}
	
	public static void printMachineState(int water, int milk, int coffeebeans, int cups, int money) {
		System.out.println("The coffee machine has:");
		System.out.println(water + " of water");
		System.out.println(milk + " of milk");
		System.out.println(coffeeBeans + " of coffee beans");
		System.out.println(cups + " of disposable cups");
		System.out.println("$" + money + " of money");
		System.out.println();
	}
	
	public static void buy(String coffeeType) {
		switch (coffeeType) {
		//Case 1 selects Espresso
		case "1":
			water -= ESPRESSO_WATER;
			coffeeBeans -= ESPRESSO_COFFEEBEANS;
			cups--;
			money += ESPRESSO_COST;
			break;
		//Case 2 selects Latte
		case "2":
			water -= LATTE_WATER;
			milk -= LATTE_MILK;
			coffeeBeans -= LATTE_COFFEEBEANS;
			cups--;
			money += LATTE_COST;
			break;
		//Case 3 selects Cappuccino
		case "3":
			water -= CAPPUCCINO_WATER;
			milk -= CAPPUCCINO_MILK;
			coffeeBeans -= CAPPUCCINO_COFFEEBEANS;
			cups--;
			money += CAPPUCCINO_COST;
			break;
		case "back":
			break;
		default:
			System.out.println("No valid coffee selected");
			break;
		}
	}
	
	public static void fill() {
		System.out.println("Write how many ml of water do you want to add:");
		int fillWater = scanner.nextInt();
		
		System.out.println("Write how many ml of milk do you want to add:");
		int fillMilk = scanner.nextInt();
		
		System.out.println("Write how many grams of coffee beans do you want to add:");
		int fillCoffeeBeans = scanner.nextInt();
		
		System.out.println("Write how many disposable cups of coffee do you want to add:");
		int fillCups = scanner.nextInt();
		
		System.out.println();
		
		water += fillWater;
		milk += fillMilk;
		coffeeBeans += fillCoffeeBeans;
		cups += fillCups;
		
	}
	
	public static void take() {
		System.out.println("I gave you $" + money);
		System.out.println();
		money = 0;
	}
	
	public static boolean checkResources(int water, int milk, int coffeebeans, int cups) {
		boolean makeCoffee = false;
		System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
		coffeeType = scanner.nextLine();
		
		if (coffeeType.contains("1") && water >= ESPRESSO_WATER && coffeebeans >= ESPRESSO_COFFEEBEANS && cups > 0) {
			System.out.println("I have enough resources, making you a coffee!");
			makeCoffee = true;
		} else if (coffeeType.contains("2") && water >= LATTE_WATER && milk >= LATTE_MILK && coffeebeans >= LATTE_COFFEEBEANS && cups > 0) {
			System.out.println("I have enough resources, making you a coffee!");
			makeCoffee = true;
		} else if (coffeeType.contains("3") && water >= CAPPUCCINO_WATER && milk >= CAPPUCCINO_MILK && coffeebeans >= CAPPUCCINO_COFFEEBEANS && cups > 0) {
			System.out.println("I have enough resources, making you a coffee!");
			makeCoffee = true;
		}
		
		if (water < ESPRESSO_WATER || water < LATTE_WATER || water < CAPPUCCINO_WATER) {
			System.out.println("Sorry, not enough water!");
			makeCoffee = false;
		} else if (milk < LATTE_MILK || milk < CAPPUCCINO_MILK) {
			System.out.println("Sorry, not enough milk!");
			makeCoffee = false;
		} else if (coffeebeans < ESPRESSO_COFFEEBEANS || coffeebeans < LATTE_COFFEEBEANS || coffeebeans < CAPPUCCINO_COFFEEBEANS) {
			System.out.println("Sorry, not enough coffee beans!");
			makeCoffee = false;
		} else if (cups < 0) {
			System.out.println("Sorry, no more cup!");
			makeCoffee = false;
		}
		return makeCoffee;
		
	}

}

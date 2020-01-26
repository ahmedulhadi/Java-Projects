package io.sharif.com;

import java.util.Scanner;

public class PizzaOrder {
	public static void main(String[] args) {
		String firstName;
		boolean discount = false;
		int size;
		double prize;
		String crust = "";
		char crustType = 0;
		String input = "";
		char choice;
		int numberOfToppings = 0;
		String toppings = "Chese";
		double tax;
		double taxRate = 0.08;
		double total = 0;

		// Prompt user and get frist name
		Scanner sc = new Scanner(System.in); // created scanner
		System.out.println("Please Enter Your First Name: ");
		firstName = sc.nextLine();

		// Determine if the user eligable for discount.
		if (firstName.equalsIgnoreCase("Ahmed") || firstName.equalsIgnoreCase("Sadia")) {
			discount = true;

		}

		// Prompt the user to choose the size of Pizza
		System.out.println("Pizza Size in Inches	Cost ");
		System.out.println("	10	$10.99");
		System.out.println("	12	$12.99");
		System.out.println("	14	$14.99");
		System.out.println("	16	$16.99");
		System.out.println("What size of pizza would you like?");
		System.out.println("10,12,14 or 16 Choose one of the Number Only:");
		size = sc.nextInt();

		// set a price for pizza sizes
		if (size == 10) {
			prize = 10.99;
		} else if (size == 12) {
			prize = 12.99;
		} else if (size == 14) {
			prize = 14.99;
		} else if (size == 16) {
			prize = 16.99;
		} else {
			System.out.println("Wrong input! We will make a 12 inch Pizza");
			prize = 12.99;
		}

		// crust type
		sc.nextLine();
		System.out.println("What type of Crust would you like ? ");
		System.out.println("(H) Hand-tossed, (T) Thin-crust, or (D) Deep-dish (Enter H, T  or D:");
		input = sc.nextLine();
		crustType = input.charAt(0);

		// set a users crust choice
		switch (crustType) {
		case 'h':
		case 'H':
			crust = "Hand-tossed";
			break;

		case 'd':
		case 'D':
			crust = "Deep-dish";
			break;

		case 't':
		case 'T':
			crust = "Thin-crust";
			break;

		}

		// Prompt user and get topping
		System.out.println("All Pizzas come with cheese.");
		System.out.println("Additional toppings are $1.25 each, choose from: ");
		System.out.println("Pepperoni, Sausage, Onion, Mushroom.");

		// topping choice and add topping list together
		System.out.print("Do you want Pepperoni? (Y/N): ");
		input = sc.nextLine(); // NOT CLEAR NEED HELP
		choice = input.charAt(0);
		if (choice == 'Y' || choice == 'y') {
			numberOfToppings += 1;
			toppings = toppings + "Pepperoni";

		}
		System.out.print("Do you want Sausage? (Y/N): ");
		input = sc.nextLine(); // NOT CLEAR NEED HELP
		choice = input.charAt(0);
		if (choice == 'Y' || choice == 'y') {
			numberOfToppings += 1;
			toppings = toppings + "Sausage";

		}
		System.out.print("Do you want Onion? (Y/N): ");
		input = sc.nextLine(); // NOT CLEAR NEED HELP
		choice = input.charAt(0);
		if (choice == 'Y' || choice == 'y') {
			numberOfToppings += 1;
			toppings = toppings + "Onion";

		}
		System.out.print("Do you want Mashroom? (Y/N): ");
		input = sc.nextLine(); // NOT CLEAR NEED HELP
		choice = input.charAt(0);
		if (choice == 'Y' || choice == 'y') {
			numberOfToppings += 1;
			toppings = toppings + "Mashroom";

		}

		// Add the cost of aditional topping
		prize = prize + 1.25 * numberOfToppings;

		// Order Confirmation Receipt
		// System.out.println();
		System.out.println("Your order is as follower");
		System.out.println(size + "inch pizza. ");
		System.out.println(crust + " crust");
		System.out.println(toppings + " toppings");

		// Apply the discount
		if (firstName.equalsIgnoreCase("Ahmed") || firstName.equalsIgnoreCase("Sadia")) {
			discount = true;
			System.out.println("Congrats, You got $2.00 discount.");
			prize = prize - 2;
		}

		// Calculate the total
		tax = prize * taxRate;
		System.out.printf("The tax is: $%.2f\n", tax);
		total = tax + prize;
		System.out.printf("The total due is: $%.2f\n ", total);
		System.out.println("Your order will be ready for pick up in 30 minutes.");
	}
}
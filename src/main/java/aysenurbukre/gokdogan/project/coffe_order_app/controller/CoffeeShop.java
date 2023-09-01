package aysenurbukre.gokdogan.project.coffe_order_app.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import aysenurbukre.gokdogan.project.coffe_order_app.model.Coffee;

public class CoffeeShop {
	private Map<Integer, Coffee> menu;

	// adding coffee ingredient to menu
	public CoffeeShop() {
		menu = new HashMap<>();
		menu.put(1, new Coffee("Espresso", new String[] { "Espresso" }));
		menu.put(2, new Coffee("Double Espresso", new String[] { "2x Espresso" }));
		menu.put(3, new Coffee("Cappuccino", new String[] { "Espresso", "Steamed Milk", "Milk Foam" }));
		menu.put(4, new Coffee("Caffe Latte", new String[] { "Espresso", "2x Steamed Milk", "Milk Foam" }));
		menu.put(5, new Coffee("Mocha", new String[] { "Espresso", "Steamed Milk", "Milk Foam", "2x Hot Chocolate" }));
		menu.put(6, new Coffee("Americano", new String[] { "Espresso", "4x Hot Water" }));
		menu.put(7, new Coffee("Hot Water", new String[] { "5x Hot Water" }));

	}

	// displaying menu
	public String displayMenu() {
		String coffeeMenu;
		coffeeMenu = "Coffe Menu:\n";
		System.out.println("Coffe Menu:");
		for (Map.Entry<Integer, Coffee> entry : menu.entrySet()) {
			coffeeMenu += entry.getKey() + ". " + entry.getValue().getName() + "\n";
			System.out.println(entry.getKey() + ". " + entry.getValue().getName());
		}
		return coffeeMenu;
	}

	// ordering coffee and show ingredient to the users
	public void orderCoffee(int coffeeNumber) {
		if (menu.containsKey(coffeeNumber)) {
			Coffee coffee = menu.get(coffeeNumber);
			String[] ingredients = coffee.getIngredients();
			System.out.println("Thank You ! " + coffee.getName() + " has been selected.");
			System.out.println("---------------------------");
			System.out.println(coffee.getName() + " is being prepared.");
			System.out.println("---------------------------");
			System.out.println(coffee.getName() + " contains:");

			for (String ingredient : ingredients) {
				System.out.println("- " + ingredient);
			}

			// System.out.println("included.");
			System.out.println("Enjoy your meal!");
			System.out.println("---------------------------");

		} else {
			System.out.println("Invalid coffee number.");
		}
	}

	public void startOrderProcess() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Do you want to order coffee? (y/n)");
			String response = scanner.next();

			if (response.equalsIgnoreCase("y")) {
				System.out.println("Please choose a coffee number:");
				System.out.println("---------------------------");
				displayMenu();
				int coffeeNumber = scanner.nextInt();

				if (menu.containsKey(coffeeNumber)) {
					orderCoffee(coffeeNumber);
				} else {
					System.out.println("Invalid coffee number.");
				}
			} else if (response.equalsIgnoreCase("n")) {
				System.out.println("Thank you for visiting our Coffee Shop!");
				break;
			} else {
				System.out.println("Invalid response. Please enter 'y' or 'n'.");
			}
		}

		scanner.close();
	}
}

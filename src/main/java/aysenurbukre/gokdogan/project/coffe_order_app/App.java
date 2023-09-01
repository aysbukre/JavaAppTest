package aysenurbukre.gokdogan.project.coffe_order_app;

import aysenurbukre.gokdogan.project.coffe_order_app.controller.CoffeeShop;

public class App {
	public static void main(String[] args) {
		CoffeeShop coffeeShop = new CoffeeShop();

		System.out.println("Welcome to our Coffee Shop");
		System.out.println("---------------------------");

		coffeeShop.startOrderProcess();
	}

}

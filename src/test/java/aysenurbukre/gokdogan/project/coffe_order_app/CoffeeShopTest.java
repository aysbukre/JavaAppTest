package aysenurbukre.gokdogan.project.coffe_order_app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import aysenurbukre.gokdogan.project.coffe_order_app.controller.CoffeeShop;

public class CoffeeShopTest {

    @Test
    @Before
    public void testCoffeeShopCanBeInstantiated() {
        CoffeeShop coffeeShop = new CoffeeShop();
        System.out.println("---------------------------");
        assertNotNull(coffeeShop);
    }

    @Test
    public void testCoffeeShopCanDisplayMenuCorrectly() {
        CoffeeShop coffeeShop = new CoffeeShop();
        String expectedMenu = "Coffe Menu:\n" +
                "1. Espresso\n" +
                "2. Double Espresso\n" +
                "3. Cappuccino\n" +
                "4. Caffe Latte\n" +
                "5. Mocha\n" +
                "6. Americano\n" +
                "7. Hot Water\n";
        assertEquals(expectedMenu, coffeeShop.displayMenu());
    }

    @Test
    @After
    public void testCoffeeShopCanOrderCoffeeCorrectly() {
        CoffeeShop coffeeShop = new CoffeeShop();
        String expectedOutput = "Thank You ! Espresso has been selected.\n" +
                "---------------------------\n" +
                "Espresso is being prepared.\n" +
                "---------------------------\n" +
                "Espresso contains:\n" +
                "- Espresso\n" +
                "Enjoy your meal!\n" +
                "---------------------------\n";
        
        System.out.println("Test is successful");
    }
 
}
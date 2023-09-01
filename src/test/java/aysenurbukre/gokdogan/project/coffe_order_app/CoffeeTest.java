package aysenurbukre.gokdogan.project.coffe_order_app;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import aysenurbukre.gokdogan.project.coffe_order_app.model.Coffee;

public class CoffeeTest {

    @Test
    public void testCoffeeCanBeInstantiated() {
        Coffee coffee = new Coffee("Espresso", new String[]{"Espresso"});
        assertNotNull(coffee);
    }

    @Test
    public void testGetCoffeeName() {
        Coffee coffee = new Coffee("Espresso", new String[]{"Espresso"});
        assertEquals("Espresso", coffee.getName());
    }

    @Test
    public void testGetCoffeeIngredients() {
        Coffee coffee = new Coffee("Espresso", new String[]{"Espresso"});
        assertArrayEquals(new String[]{"Espresso"}, coffee.getIngredients());
    }
}

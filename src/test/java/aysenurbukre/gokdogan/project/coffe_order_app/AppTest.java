package aysenurbukre.gokdogan.project.coffe_order_app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	CoffeeShopTest.class,
	CoffeeTest.class
})

public class AppTest {

	@Test
	public void shouldAnswerWithTrue()
	{
		assertTrue(true);
	}
	
}

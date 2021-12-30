package A1;

import static org.junit.Assert.assertNotNull;

public class CalculatorTest {

	Calculator calculator = new Calculator();
	@org.junit.Test
	public void notNullTest() {
		assertNotNull(calculator);
	}
	
}

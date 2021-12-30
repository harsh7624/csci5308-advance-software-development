package A1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AdditionTest {

	int positiveNumber1 = 7;
	int positiveNumber2 = 3;
	int positiveAddition = 10;
	int negativeNumber1 = -7;
	int negativeNumber2 = -4;
	int negativeAddition = -11;
	int customAddition = 3;
	
	Calculator calculator = new Calculator();
	
	@Test
	public void checkTwoPositiveAddition() {
		assertEquals(positiveAddition, calculator.testAddition(positiveNumber1, positiveNumber2));
	}
	
	@Test
	public void checkTwoNegativeAddition() {
		assertEquals(negativeAddition, calculator.testAddition(negativeNumber1, negativeNumber2));
	}
	
	@Test
	public void checkOnePositiveOneNegative() {
		assertEquals(customAddition, calculator.testAddition(positiveNumber1, negativeNumber2));
	}
}

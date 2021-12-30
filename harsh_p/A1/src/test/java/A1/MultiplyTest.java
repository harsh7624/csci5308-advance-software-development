package A1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MultiplyTest {

	int positiveNumber1 = 7;
	int positiveNumber2 = 3;
	int positiveMultiplication = 21;
	int negativeNumber1 = -7;
	int negativeNumber2 = -4;
	int negativeNoMultiplication = 28;
	int oneEachMultiplication = -28;
	
	Calculator calculator = new Calculator();
	
	@Test
	public void checkTwoPositiveMultiplication() {
		assertEquals(positiveMultiplication, calculator.testMultiplication(positiveNumber1, positiveNumber2));
	}
	
	@Test
	public void checkTwoNegativeMultiplication() {
		assertEquals(negativeNoMultiplication, calculator.testMultiplication(negativeNumber1, negativeNumber2));
	}
	
	@Test
	public void checkOnePositiveOneNegative() {
		assertEquals(oneEachMultiplication, calculator.testMultiplication(positiveNumber1, negativeNumber2));
	}
	
	@Test
	public void checkMultiplyWithZero() {
		assertEquals(0, calculator.testMultiplication(positiveNumber1, 0));
	}
}

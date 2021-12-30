package A1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubtractionTest {

	int positiveNumber1 = 7;
	int positiveNumber2 = 3;
	int positiveSubtraction = 4;
	int negativeNumber1 = -7;
	int negativeNumber2 = -4;
	int negativeSubtraction = -3;
	int oneEachSubtraction = 11;
	
	Calculator calculator = new Calculator();
	
	@Test
	public void checkTwoPositiveSubtraction() {
		assertEquals(positiveSubtraction, calculator.testSubtraction(positiveNumber1, positiveNumber2));
	}
	
	@Test
	public void checkTwoNegativeSubtraction() {
		assertEquals(negativeSubtraction, calculator.testSubtraction(negativeNumber1, negativeNumber2));
	}
	
	@Test
	public void checkOnePositiveOneNegative() {
		assertEquals(oneEachSubtraction, calculator.testSubtraction(positiveNumber1, negativeNumber2));
	}
	
}

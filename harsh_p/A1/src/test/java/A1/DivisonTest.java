package A1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivisonTest {

	int positiveNumber1 = 6;
	int positiveNumber2 = 3;
	int positiveDivision = 2;
	int negativeNumber1 = -8;
	int negativeNumber2 = -2;
	int negativeDivision = 4;
	int oneEachdivision = -3;
	
	Calculator calculator = new Calculator();
	
	@Test
	public void checkTwoPositiveDivision() {
		assertEquals(positiveDivision, calculator.testDivision(positiveNumber1, positiveNumber2));
	}
	
	@Test
	public void checkTwoNegativeDivision() {
		assertEquals(negativeDivision, calculator.testDivision(negativeNumber1, negativeNumber2));
	}
	
	@Test
	public void checkOnePositiveOneNegativeDivision() {
		assertEquals(oneEachdivision, calculator.testDivision(positiveNumber1, negativeNumber2));
	}
		
}

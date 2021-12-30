package A1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class ValidateDecimalTest {

	Validation validator = new Validation();
	String strNumbers[] = new String[] {"1.11","2.22"};
	String strNumbers2[] = new String[] {"1.11","2.222"};
	
	@Test
	public void checkValidate() {
		List<String> validate = validator.validateDecimal(strNumbers);
		assertTrue(validate.size() == 0);
	}
	
	@Test
	public void checkFalseValidate() {
		List<String> validate2 = validator.validateDecimal(strNumbers2);
		assertFalse(validate2.size() == 0);
	}
	
	@Test
	public void checkTooManyDecimals() {
		
		List<String> validate = validator.validateDecimal("1.11","2.222");
		assertTrue(validate.size() == 1);
		assertEquals(validate.get(0), "Too many decimal places for value 2.222");
	}
	
	@Test
	public void checkTooManyDecimals2() {
			
			List<String> validate = validator.validateDecimal("1.11","2.222","3.333","4.4444");
			assertTrue(validate.size() == 3);
			assertEquals(validate.get(0), "Too many decimal places for value 2.222");
			assertEquals(validate.get(1), "Too many decimal places for value 3.333");
			assertEquals(validate.get(2), "Too many decimal places for value 4.4444");
		}
}

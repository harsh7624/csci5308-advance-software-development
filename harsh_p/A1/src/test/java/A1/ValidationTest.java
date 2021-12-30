package A1;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ValidationTest {

	Validation validator = new Validation();
	
	@Test
	public void notNullTest() {
		assertNotNull(validator);
	}
}

package A1;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class FizzBuzzTest {

	Calculator fizzbuzz = new Calculator();
	int checkFizzBuzz = 15; 
	int fizz = 9;
	int Buzz = 10;
	int number = 8;
	
	@Test
	public void checkFizzBuzz() {
		assertEquals(fizzbuzz.fizzBuzz(checkFizzBuzz),"FizzBuzz");
	}
	
	@Test
	public void checkFizz() {
		assertEquals(fizzbuzz.fizzBuzz(fizz),"Fizz");
	}
	
	@Test
	public void checkBuzz() {
		assertEquals(fizzbuzz.fizzBuzz(Buzz),"Buzz");
	}
	
	@Test
	public void checkNumber() {
		assertEquals(fizzbuzz.fizzBuzz(number),Integer.toString(number));
	}
}

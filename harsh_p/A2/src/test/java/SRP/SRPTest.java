package SRP;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import bad.Calculator;
import org.junit.Test;

public class SRPTest {
    Calculator violation = new Calculator();
    int number1 = 6;
    int number2 = 3;
    int addition = 9;
    int subtraction = 3;
    int multiplication = 18;
    int division = 2;
    int checkFizzBuzz = 15;

    @org.junit.Test
    public void notNullTest() {
        assertNotNull(violation);
    }

    @Test
    public void addition() {
        assertEquals(addition, violation.addition(number1, number2));
    }

    @Test
    public void subtraction() {
        assertEquals(subtraction, violation.subtract(number1, number2));
    }

    @Test
    public void multiplication() {
        assertEquals(multiplication, violation.multiply(number1, number2));
    }

    @Test
    public void division() {
        assertEquals(division, violation.division(number1, number2));
    }

    @Test
    public void checkFizzBuzz() {
        assertEquals(violation.fizzBuzz(checkFizzBuzz),"FizzBuzz");
    }


}

package SRP;

import good.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SRPSolutionTest {
    good.Calculator calculator = new good.Calculator();
    FizzBuzz fizzBuzz = new FizzBuzz();
    int number1 = 6;
    int number2 = 3;
    int addition = 9;
    int subtraction = 3;
    int multiplication = 18;
    int division = 2;
    int checkFizzBuzz = 15;
    //    Now writing for Good package

    @Test
    public void solutionAddition() {
        assertEquals(addition, calculator.addition(number1, number2));
    }

    @Test
    public void solutionSubtraction() {
        assertEquals(subtraction, calculator.subtract(number1, number2));
    }

    @Test
    public void solutionMultiplication() {
        assertEquals(multiplication, calculator.multiply(number1, number2));
    }

    @Test
    public void solutionDivision() {
        assertEquals(division, calculator.division(number1, number2));
    }

    //    Fizz buzz
    @Test
    public void solutionCheckFizzBuzz() {
        assertEquals(fizzBuzz.fizzBuzz(checkFizzBuzz),"FizzBuzz");
    }
}

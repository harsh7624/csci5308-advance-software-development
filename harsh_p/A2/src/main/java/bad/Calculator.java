package bad;

public class Calculator {
    // SRP Violation
    // Creating addition, subtraction

    public int addition(int number1, int number2){
        return number1 + number2;
    }

    public int subtract(int number1, int number2){
        return number1 - number2;
    }

    public int multiply(int number1, int number2){
        return number1 * number2;
    }

    public int division(int number1, int number2){
        return number1 / number2;
    }

    public String fizzBuzz(int number) {

        if(number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        else if(number % 3 == 0) {
            return "Fizz";
        }
        else if(number % 5 == 0) {
            return "Buzz";
        }
        else {
            return Integer.toString(number);
        }
    }
}

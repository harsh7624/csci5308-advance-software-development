package A1;

import java.util.List;

public class Calculator {

	private Validation validation;
	
	public Calculator(Validation validation) {
		this.validation=validation;
	}
	
	public Calculator() {
		
	}
//	Validation validate =  new Validation();

	
	public int testAddition(int number1,int number2) {
		return number1 + number2;
	}
	
	public int testSubtraction(int number1,int number2) {
		return number1 - number2;
	}
	
	public int testMultiplication(int number1,int number2) {
		return number1 * number2;
	}
	
	public int testDivision(int number1,int number2) {
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
	
//	public String testAddStrings(String str1, String str2) {
//		double number1 = Double.parseDouble(str1);
//		double number2 = Double.parseDouble(str2);
//		double total = number1+number2;
//		return Double.toString(total);
//	}

	public String testAddStrings(String str1, String str2) throws Exception {
		String[] str1Parts = str1.split("[.]");
		String[] str2Parts = str1.split("[.]");
		int decimal1Length = str1Parts[1].length();
		int decimal2Length = str2Parts[1].length();
		if(decimal1Length > 2 || decimal2Length > 2) {
			throw new Exception();
		}
		double number1 = Double.parseDouble(str1);
		double number2 = Double.parseDouble(str2);
		double total = number1+number2;
		return Double.toString(total);
	}
	
	public String testAddStrings_Revised(String str1,String str2) throws Exception {
		
		List<String> validateNumbers = validation.validateDecimal(str1);
		if(validateNumbers.size() > 0) {
			throw new Exception();
		}
		double number1 = Double.parseDouble(str1);
		double number2 = Double.parseDouble(str2);
		double total = number1+number2;
		return Double.toString(total);
	}

	
	public String testSubtractStrings(String str1, String str2) throws Exception {
		String[] str1Parts = str1.split("[.]");
		String[] str2Parts = str1.split("[.]");
		int decimal1Length = str1Parts[1].length();
		int decimal2Length = str2Parts[1].length();
		if(decimal1Length > 2 || decimal2Length > 2) {
			throw new Exception();
		}
		double number1 = Double.parseDouble(str1);
		double number2 = Double.parseDouble(str2);
		double difference = number1-number2;
		return Double.toString(difference);
	}
	
	public String testSubtractStrings_Revised(String str1,String str2) throws Exception {
		
		List<String> validateNumbers = validation.validateDecimal(str1);
		if(validateNumbers.size() > 0) {
			throw new Exception();
		}
		double number1 = Double.parseDouble(str1);
		double number2 = Double.parseDouble(str2);
		double difference = number1-number2;
		return Double.toString(difference);
	}
	
	public String testMultiplicationStrings(String str1, String str2) throws Exception {
		String[] str1Parts = str1.split("[.]");
		String[] str2Parts = str1.split("[.]");
		int decimal1Length = str1Parts[1].length();
		int decimal2Length = str2Parts[1].length();
		if(decimal1Length > 2 || decimal2Length > 2) {
			throw new Exception();
		}
		double number1 = Double.parseDouble(str1);
		double number2 = Double.parseDouble(str2);
		double multiply = number1*number2;
		return Double.toString(multiply);
	}
	
	public String testMultiplicationStrings_Revised(String str1,String str2) throws Exception {
		
		List<String> validateNumbers = validation.validateDecimal(str1);
		if(validateNumbers.size() > 0) {
			throw new Exception();
		}
		double number1 = Double.parseDouble(str1);
		double number2 = Double.parseDouble(str2);
		double multiply = number1*number2;
		return Double.toString(multiply);
	}
	
//	public String testDivisionStrings(String str1, String str2) throws Exception {
//		String[] str1Parts = str1.split("[.]");
//		String[] str2Parts = str1.split("[.]");
//		int decimal1Length = str1Parts[1].length();
//		int decimal2Length = str2Parts[1].length();
//		if(decimal1Length > 2 || decimal2Length > 2) {
//			throw new Exception();
//		}
//		double number1 = Double.parseDouble(str1);
//		double number2 = Double.parseDouble(str2);
//		double division = number1/number2;
//		return Double.toString(division);
//	}
	
//	For step 8
	public String testDivisionStrings(String str1, String str2) throws Exception {
		String[] str1Parts = str1.split("[.]");
		String[] str2Parts = str1.split("[.]");
		int decimal1Length = str1Parts[1].length();
		int decimal2Length = str2Parts[1].length();
		if(decimal1Length > 2 || decimal2Length > 2) {
			throw new Exception();
		}
		double number1 = Double.parseDouble(str1);
		double number2 = Double.parseDouble(str2);
		if(number2 == 0) {
			throw new ArithmeticException();
		}
		double division = number1/number2;
		return Double.toString(division);
	}
	
	
	public String testDivisionStrings_Revised(String str1,String str2) throws Exception {
		
		List<String> validateNumbers = validation.validateDecimal(str1);
		if(validateNumbers.size() > 0) {
			throw new Exception();
		}
		double number1 = Double.parseDouble(str1);
		double number2 = Double.parseDouble(str2);
		if(number2 == 0) {
			throw new ArithmeticException();
		}
		double division = number1/number2;
		return Double.toString(division);
	}


}

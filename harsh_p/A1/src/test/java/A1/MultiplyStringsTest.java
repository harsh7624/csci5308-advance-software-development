package A1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MultiplyStringsTest {

	Validation validation = new Validation();
	Calculator testMultiply = new Calculator(validation);
	String str1 = "15.23"; 
	String str2 = "9.07";
	String multiply = "138.1361"; 
	String negativestr1 = "-3.5";
	String negativestr2 = "-8.5";
	String negativemultiply = "29.75"; 
	String errStr1 = "15.234"; 
	String errStr2 = "9.077";
	
	@Test(expected = Exception.class)
	public void checkExceptionMul1() throws Exception {
		assertEquals(testMultiply.testMultiplicationStrings(errStr1,errStr2),"138.279018");
	}
	
	@Test(expected = Exception.class)
	public void checkExceptionMul2() throws Exception {
		assertEquals(testMultiply.testMultiplicationStrings(errStr1,str1),"138.17238");
	}
	
	@Test
	public void checkNegative() throws Exception {
		assertEquals(testMultiply.testMultiplicationStrings(negativestr1,negativestr2),negativemultiply);
	}
	
	@Test
	public void checkOneEach() throws Exception {
		assertEquals(testMultiply.testMultiplicationStrings(str1,negativestr2),"-129.455");
	}
	
	@Test
	public void checkPositive() throws Exception {
		assertEquals(testMultiply.testMultiplicationStrings(str1,str2),multiply);
	}

	
//	Revised
	
	@Test
	public void checkNegative2() throws Exception {
		assertEquals(testMultiply.testMultiplicationStrings_Revised(negativestr1,negativestr2),negativemultiply);
	}
	
	@Test
	public void checkOneEach2() throws Exception {
		assertEquals(testMultiply.testMultiplicationStrings_Revised(str1,negativestr2),"-129.455");
	}
	
	@Test
	public void checkPositive2() throws Exception {
		assertEquals(testMultiply.testMultiplicationStrings_Revised(str1,str2),multiply);
	}
	
	@Test(expected = Exception.class)
	public void checkExceptionMul3() throws Exception {
		assertEquals(testMultiply.testMultiplicationStrings_Revised(errStr1,str1),"138.17238");
	}
	

}

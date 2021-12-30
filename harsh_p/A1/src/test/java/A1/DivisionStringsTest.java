package A1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivisionStringsTest {

	Validation validation = new Validation();
	Calculator testDivision = new Calculator(validation);
	String str1 = "15.25"; 
	String str2 = "5.05";
	String division = "3.01980198019802"; 
	String negativestr1 = "-8.5";
	String negativestr2 = "-3.5";
	String negativeDivision = "2.4285714285714284"; 
	String errStr1 = "15.234"; 
	String errStr2 = "9.077";
	
	@Test(expected = Exception.class)
	public void checkExceptionDiv1() throws Exception {
		assertEquals(testDivision.testDivisionStrings(errStr1,errStr2),"1.67830781095");
	}
	
	@Test(expected = Exception.class)
	public void checkExceptionDiv2() throws Exception {
		assertEquals(testDivision.testDivisionStrings(errStr1,str1),"0.99895081967");
	}
	
	@Test
	public void checkNegative() throws Exception {
		assertEquals(testDivision.testDivisionStrings(negativestr1,negativestr2),negativeDivision);
	}
	
	@Test
	public void checkOneEach() throws Exception {
		assertEquals(testDivision.testDivisionStrings(str1,negativestr2),"-4.357142857142857");
	}
	
	@Test
	public void checkPositive() throws Exception {
		assertEquals(testDivision.testDivisionStrings(str1,str2),division);
	}
	
	@Test(expected = ArithmeticException.class)
	public void checkZero() throws Exception {
		assertEquals(testDivision.testDivisionStrings(str1,"0.0"),division);
	}
	
	
	
//	Revised 
	@Test
	public void checkNegative2() throws Exception {
		assertEquals(testDivision.testDivisionStrings_Revised(negativestr1,negativestr2),negativeDivision);
	}
	
	@Test
	public void checkOneEach2() throws Exception {
		assertEquals(testDivision.testDivisionStrings_Revised(str1,negativestr2),"-4.357142857142857");
	}
	
	@Test
	public void checkPositive2() throws Exception {
		assertEquals(testDivision.testDivisionStrings_Revised(str1,str2),division);
	}
	
	@Test(expected = ArithmeticException.class)
	public void checkZero2() throws Exception {
		assertEquals(testDivision.testDivisionStrings_Revised(str1,"0.0"),division);
	}
}

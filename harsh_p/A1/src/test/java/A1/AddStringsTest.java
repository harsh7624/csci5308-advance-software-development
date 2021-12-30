package A1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddStringsTest {

	Validation validation = new Validation();
	Calculator addStringTest = new Calculator(validation);
//	String str1 = "15.23"; 
//	String str2 = "9.07";
//	String total = "24.3"; 
//	String negativestr1 = "-3.5";
//	String negativestr2 = "-8.5";
//	String negativeTotal = "-12.0"; 
//	
//	@Test
//	public void checkPositiveAddition() {
//		assertEquals(addStringTest.testAddStrings(str1,str2),total);
//	}
//	
//	@Test
//	public void checkNegativeAddition() {
//		assertEquals(addStringTest.testAddStrings(negativestr1,negativestr2),negativeTotal);
//	}
//	
//	@Test
//	public void checkOneEachAddition() {
//		assertEquals(addStringTest.testAddStrings(str1,negativestr2),"6.73");
//	}
	
	String str1 = "15.23"; 
	String str2 = "9.07";
	String total = "24.3"; 
	String negativestr1 = "-3.5";
	String negativestr2 = "-8.5";
	String negativeTotal = "-12.0"; 
	String errStr1 = "15.234"; 
	String errStr2 = "9.077";
	
	@Test(expected = Exception.class)
	public void checkExceptionAddition() throws Exception {
		assertEquals(addStringTest.testAddStrings(errStr1,errStr2),"24.311");
	}
	
	@Test(expected = Exception.class)
	public void checkExceptionAddition2() throws Exception {
		assertEquals(addStringTest.testAddStrings(errStr1,str1),"30.46");
	}
	
	@Test
	public void checkNegativeAddition() throws Exception {
		assertEquals(addStringTest.testAddStrings(negativestr1,negativestr2),negativeTotal);
	}
	
	@Test
	public void checkOneEachAddition() throws Exception {
		assertEquals(addStringTest.testAddStrings(str1,negativestr2),"6.73");
	}
	
	@Test
	public void checkPositiveAddition() throws Exception {
		assertEquals(addStringTest.testAddStrings(str1,str2),total);
	}
	
	@Test
	public void checkPositiveAddition2() throws Exception {
		assertEquals(addStringTest.testAddStrings_Revised(str1,str2),total);
	}
	
	public void checkNegativeAddition2() throws Exception {
		assertEquals(addStringTest.testAddStrings_Revised(negativestr1,negativestr2),negativeTotal);
	}
	
	@Test
	public void checkOneEachAddition2() throws Exception {
		assertEquals(addStringTest.testAddStrings_Revised(str1,negativestr2),"6.73");
	}
	
	@Test(expected = Exception.class)
	public void checkExceptionAddition3() throws Exception {
		assertEquals(addStringTest.testAddStrings_Revised(errStr1,errStr2),"24.311");
	}
}

package A1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubtractStringsTest {

	Validation validation = new Validation();
	Calculator testSubtract = new Calculator(validation);
	String str1 = "15.23"; 
	String str2 = "9.07";
	String diff = "6.16"; 
	String negativestr1 = "-3.5";
	String negativestr2 = "-8.5";
	String negativediff = "5.0"; 
	String errStr1 = "15.234"; 
	String errStr2 = "9.077";
	
	@Test(expected = Exception.class)
	public void checkExceptionSub() throws Exception {
		assertEquals(testSubtract.testSubtractStrings(errStr1,errStr2),"24.311");
	}
	
	@Test(expected = Exception.class)
	public void checkExceptionSub1() throws Exception {
		assertEquals(testSubtract.testSubtractStrings(errStr1,str1),"30.46");
	}
	
	@Test
	public void checkNegativeSub() throws Exception {
		assertEquals(testSubtract.testSubtractStrings(negativestr1,negativestr2),negativediff);
	}
	
	@Test
	public void checkOneEachSub() throws Exception {
		assertEquals(testSubtract.testSubtractStrings(str1,negativestr2),"23.73");
	}
	
	@Test
	public void checkPositiveSub() throws Exception {
		assertEquals(testSubtract.testSubtractStrings(str1,str2),diff);
	}
	
	

//	Revised 
	public void checkNegativeSub2() throws Exception {
		assertEquals(testSubtract.testSubtractStrings_Revised(negativestr1,negativestr2),negativediff);
	}
	
	@Test
	public void checkOneEachSub2() throws Exception {
		assertEquals(testSubtract.testSubtractStrings_Revised(str1,negativestr2),"23.73");
	}
	
	@Test
	public void checkPositiveSub2() throws Exception {
		assertEquals(testSubtract.testSubtractStrings_Revised(str1,str2),diff);
	}
	
	@Test(expected = Exception.class)
	public void checkExceptionSub2() throws Exception {
		assertEquals(testSubtract.testSubtractStrings_Revised(errStr1,errStr2),"24.311");
	}
}

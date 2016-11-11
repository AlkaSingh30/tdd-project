package tdd.tdd;

import org.junit.Test;

public class CalculatorTest {
	
	 private Calculator calculator= new Calculator();

	    @Test
	    public void emptyStringreturnsZero() throws Exception {

	        Integer result= calculator.calculate("");
	        assertThat(result,is(equalsTo(0)));
	    }

	    @Test
	    public void singleNumberReturnsValue() throws Exception {
	        Integer result=calculator.calculate("7");
	        assertThat(result,is(equalsTo(7)));
	    }

	    @Test
	    public void twoNumbersReturnsSum() throws Exception {
	        Integer result=calculator.calculate("7,3");
	        assertThat(result,is(equalsTo(10)));
	    }

	    @Test
	    public void twoNumbersLineDelimitedReturnsSum() throws Exception {
	        Integer result=calculator.calculate("7\n4");
	        assertThat(result,is(equalsTo(11)));
	    }

	    @Test
	    public void threeNumbersEitherDelimited() throws Exception {
	        Integer result=calculator.calculate("7,3\n4");
	        assertThat(result,is(equalsTo(14)));
	        result=calculator.calculate("7,2,8");
	        assertThat(result,is(equalsTo(17)));
	        result=calculator.calculate("7\n1\n8");
	        assertThat(result,is(equalsTo(16)));

	    }
	    @Test(expected=Exception.class)
	    public void negativeNumberThrowsException()
	    {
	        try {
	            calculator.calculate("1,-7");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    @Test
	    public void negativeNumberThrowsExceptionFail()
	    {
	        try {
	            calculator.calculate("1,-7");
	            fail("Exception should have been thrown");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }





}

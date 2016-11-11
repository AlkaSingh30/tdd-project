package tdd.tdd;

public class Calculator {
	
	 public Integer calculate(String numbers) throws Exception {
	        Integer result=0;
	        if(!numbers.isEmpty())
	        {
	                result = Integer.valueOf(splitAndAddNumbers(numbers));
	        }

	        return result;
	    }

	    private Integer splitAndAddNumbers(String numbers) throws Exception {
	        Integer result=0;
	        String []splitNumbers=numbers.split("[,\\n]");
	        for(String singleNumber: splitNumbers) {
	            Integer integerValue= Integer.valueOf(singleNumber);
	            if(integerValue<0)
	            {
	                throw new Exception("Negative Number not allowed");
	            }
	            else
	            {
	                result+=integerValue;
	            }
	        }
	        return result;
	    }

}

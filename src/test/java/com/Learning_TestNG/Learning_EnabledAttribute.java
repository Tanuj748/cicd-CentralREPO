package com.Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Learning_EnabledAttribute 
{
	
	@Test(priority = -1)
    
    public void addToCartTest()
    
    {
   	 Reporter.log("Executing add to cart test case" ,true);
    }

    @Test(priority = -2)
    public void loginTest()
    {
   	 Reporter.log("Exceuting Login Test Case",true);
    }

    @Test(enabled = false)
    public void registerTest()
    {
   	 Reporter.log("Exceuting Register Test case",true);
    }



	
	
	
	
	
	
	
	
	
}

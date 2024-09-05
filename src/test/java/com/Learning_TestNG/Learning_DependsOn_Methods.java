package com.Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Learning_DependsOn_Methods 
{

	@Test(dependsOnMethods = {"registerTest" , "loginTest" })
    
    public void addToCartTest()
    
    {
   	 Reporter.log("Executing add to cart test case" ,true);
    }

    @Test(dependsOnMethods = "registerTest")
    public void loginTest()
    {
   	 Reporter.log("Exceuting Login Test Case",true);
    }

    @Test()
    public void registerTest()
    {
   	 Reporter.log("Exceuting Register Test case",true);
    }







}

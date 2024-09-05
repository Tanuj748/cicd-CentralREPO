package com.Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Learning_priorityAtrrribute
{


     @Test(priority=3)
     
     public void addToCartTest()
     {
    	 Reporter.log("Executing add to cart test case" ,true);
     }

     @Test(priority=2)
     public void loginTest()
     {
    	 Reporter.log("Exceuting Login Test Case",true);
     }

     @Test(priority = 1)
     public void registerTest()
     {
    	 Reporter.log("Exceuting Register Test case",true);
     }
}

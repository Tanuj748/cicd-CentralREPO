package com.Test_Scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.general_Utilities.Base_Test;
import com.general_Utilities.Java_Utility;
import com.general_Utilities.WebDriver_Utility;

public class Cart_Test extends Base_Test
{
	
   @Test
   public void addProductToCartTest() throws InterruptedException, IOException
   {
	  
	  if(driver.findElement(By.linkText("Log out")).isDisplayed())
			  {
		          WebElement element = driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[@value='Add to cart']"));
		          Actions action = new Actions(driver);
		          action.scrollToElement(element);
		          element.click();
		          
		          test.log(Status.PASS, "Product is added to cart.......");
		          
		          WebElement element2 = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
		          action.scrollToElement(element2);
		          element2.click();
		          Thread.sleep(2000);
		          
		          test.log(Status.INFO, "Cart Page is Displayed Successfully........");
		          WebDriver_Utility.takesscreenshotOfWebPage(driver, "screenshot_"+Java_Utility.currentDate());
		          test.addScreenCaptureFromBase64String(WebDriver_Utility.getBase64Screenshot(driver));
		          
		              
			  }
	}

   @Test(dependsOnMethods = "addProductToCartTest")
   public void removeProductFromTheCart() throws IOException
   {
	  if(driver.findElement(By.linkText("Log out")).isDisplayed())
	  {
		  driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		  
		  test.log(Status.INFO, "Cart Page is Displayed Successfully.......");
		  
		  driver.findElement(By.xpath("(//a[text()='14.1-inch Laptop'])[2]/../..//input[@name='removefromcart']")).click();
		  driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		  test.log(Status.INFO, "Product removed successfully from the cart.....");
		  WebDriver_Utility.takesscreenshotOfWebPage(driver, "screenshot_"+Java_Utility.currentDate());
          test.addScreenCaptureFromBase64String(WebDriver_Utility.getBase64Screenshot(driver));
		  
	  }
	   
	   
	   
   }





}

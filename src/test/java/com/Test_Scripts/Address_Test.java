package com.Test_Scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.general_Utilities.Base_Test;

public class Address_Test extends Base_Test
{

   @Test
   public void AddTheAddressTest() throws IOException , InterruptedException
   {
	   if(driver.findElement(By.linkText("Log out")).isDisplayed())
	   {
		   driver.findElement(By.linkText("tanishbarwal2024@gmail.com")).click();
		   driver.findElement(By.linkText("Addresses")).click();
		   driver.findElement(By.xpath("//input[@value='Add new']")).click();
		   driver.findElement(By.id("Address_FirstName")).sendKeys("Rahul");
		   driver.findElement(By.id("Address_LastName")).sendKeys("Chaurasia");
		   driver.findElement(By.id("Address_Email")).sendKeys("rahulchaurasia2013@gmail.com");
		   Select sel = new Select(driver.findElement(By.id("Address_CountryId")));
		   sel.selectByVisibleText("India");
		   
		   driver.findElement(By.id("Address_City")).sendKeys("Gurrugram");
		   driver.findElement(By.id("Address_Address1")).sendKeys("Hyun Tower");
		   driver.findElement(By.id("Address_ZipPostalCode")).sendKeys("141015");
		   driver.findElement(By.id("Address_PhoneNumber")).sendKeys("9912345678");
		   driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		   Thread.sleep(3000);
		   
		}
   }  
	   @Test(dependsOnMethods = "AddTheAddressTest")
	   public void removeAddressTest() throws IOException
	   {
		   if(driver.findElement(By.linkText("Log out")).isDisplayed())
		   {
		       driver.findElement(By.linkText("tanishbarwal2024@gmail.com")).click();
		       driver.findElement(By.xpath("(//a[text()='Addresses'])[1]")).click();
		       driver.findElement(By.xpath("//input[@value='Delete']")).click();
		        
		       driver.switchTo().alert().accept();
		       
		   }
		   
		   
      }
 }















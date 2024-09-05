package com.Learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Cart_Test 
{

	@Test
	public void addToCartTest()
	
	{
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://demowebshop.tricentis.com/");
	  
	  if(driver.getTitle().equals("Demo Web Shop"))
	  {
		  System.out.println("Demo WebShop Home Page is open");
		  driver.findElement(By.linkText("Log in")).click();
		  
		  if(driver.getTitle().equals("Demo Web Shop. Login"))
		  {
			  System.out.println("Login Page is opened"); 
			  driver.findElement(By.id("Email")).sendKeys("tanishbarwal2024@gmail.com");
			  driver.findElement(By.id("Password")).sendKeys("123321123");
			  driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
			  if(driver.getTitle().equals("Demo Web Shop"))
			  {
				  System.out.println("Demo WebShop Home Page is Open");
				  Actions action = new Actions(driver);
				WebElement w1 =   driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]"));
				
			  }
			  
			  
			  
		  }
			  
	
	
	}
	
	
	
	
	
	
}
}
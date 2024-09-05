package com.Learning_TestNG;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Learning_Data_Provider_Annotation 
{

  @DataProvider(name = "loginData")
  public String[][] dataProvider()
  {
	  String [][] data = new String[3][2];
	  
	  data[0][0] = "tanishbarwal2024@gmail.com";
	  data[0][1] = "123321123";
	  
	  data[1][0] = "ravip22@gmai.com";
	  data[1][1] = "123456";
	  
	  data[2][0] = "amamhussain2003@gmail.com";
	  data[2][1] = "Amam@Demo";
	  
	  return data;
   
  }
	
	
   @Test(dataProvider = "loginData")
   public void loginTest(String email , String password) throws InterruptedException
   {
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://demowebshop.tricentis.com/");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.findElement(By.linkText("Log in")).click();
	   
	   driver.findElement(By.id("Email")).sendKeys(email);
	   driver.findElement(By.id("Password")).sendKeys(password);
	   driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	   Thread.sleep(2000);
	   driver.quit();







}
	
	
 
	 

}

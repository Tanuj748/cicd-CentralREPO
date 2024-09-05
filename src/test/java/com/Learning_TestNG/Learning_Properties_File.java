package com.Learning_TestNG;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Learning_Properties_File 
{
	@Test
	public void loginToDWS() throws IOException, InterruptedException 
	{
         
		

	 // we have to create java representation object of external file
	  FileInputStream fis = new FileInputStream("./src/main/resources/data/commonData.properties");
	
  // Create the object of the properties class
	  Properties prop = new Properties();
		
  // load all the keys of properties file into Properties class object
	  prop.load(fis);
	  
  // fetch the value based on key
	         String URL = prop.getProperty("url");
	         String EMAIL = prop.getProperty("email");
	         String PASSWORD = prop.getProperty("password");
		
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();    
		   driver.get(URL);
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.findElement(By.linkText("Log in")).click();
		   
		   driver.findElement(By.id("Email")).sendKeys(EMAIL);
		   driver.findElement(By.id("Password")).sendKeys(PASSWORD);
		   driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		   Thread.sleep(3000);
		   driver.quit();
		   
		   

	  
     }
}

package com.Learning_TestNG;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.general_Utilities.File_Utility;

import WebElement_Methods.Is_Displayed;

public class Learning_Hard_Assert 
{
    @Test
    public void DWSloginTest()
    {
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    driver.get(File_Utility.getDataFromPropertiesFile("url"));
    
    Assert.assertEquals(driver.getTitle(), "Demo Web Shop" , "Validating Wecome Page");
    driver.findElement(By.xpath("//a[text()='Log in']")).click();
    
   WebElement heading = driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']"));
    Assert.assertEquals(heading.isDisplayed(), true , "Validating login Page");
    
    
    driver.findElement(By.id("Email")).sendKeys("tanishbarwal2024@gmail.com");
    driver.findElement(By.id("Password")).sendKeys("123321123");
    driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	
  WebElement link =   driver.findElement(By.linkText("tanishbarwal2024@gmail.com"));
  Assert.assertEquals(link.isDisplayed(), true , "Validating Home Page");
  driver.quit();
	
	
}
}
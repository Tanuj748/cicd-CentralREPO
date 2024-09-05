package com.Learning_TestNG;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.general_Utilities.File_Utility;

public class Using_File_Utility 
{

   @DataProvider(name = "loginData")
   public String[][] loginData()
   {
	  
	  String [] [] multipleData=  File_Utility.getMultipleDataFromExcel("MultipleData");
	  return multipleData;
   }
   
	 @Test(dataProvider = "loginData")
    public void loginToDWSByUsingMultipleData(String email , String password) throws InterruptedException, EncryptedDocumentException, IOException
    {
	
	 WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
     driver.get(File_Utility.getDataFromPropertiesFile("url"));
         Thread.sleep(3000);
     
     driver.findElement(By.xpath("//a[text()='Log in']")).click();
     driver.findElement(By.id("Email")).sendKeys(password);
     
    driver.findElement(By.id("Password")).sendKeys(email);
     driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
     
     Thread.sleep(2000);
     driver.quit();
    
   }
	
	
	
}

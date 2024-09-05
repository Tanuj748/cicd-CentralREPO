package com.Learning_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.general_Utilities.File_Utility;
public class Fetching_Single_Data_FromExcel {
    @Test
    public void RegisterToDWS() throws EncryptedDocumentException, IOException
    {
 //     Create java representation object of external file
    	FileInputStream fis = new FileInputStream("./src/test/resources/data/Register Data.xlsx");
   
//      traverse to the workbook (open the workbook in read mode)
    	Workbook book = WorkbookFactory.create(fis);
    	
//      traverse to the sheet based on the sheetName
    	Sheet sheet = book.getSheet("Sheet1");
    	
//      traverse to the specific row based on the index
    	Row row = sheet.getRow(1);
    	
//      traverse to the specific cell based on the index
    	Cell cell = row.getCell(0);
    	
    	
    	 String GENDER = cell.getStringCellValue();
    	 String FIRSTNAME = row.getCell(1).getStringCellValue();
    	 String LASTNAME = row.getCell(2).getStringCellValue();
    	 String EMAIL = row.getCell(3).getStringCellValue();
    	 String PASSWORD = row.getCell(4).getStringCellValue();
    	 String CONFIRMPASSWORD = row.getCell(5).getStringCellValue();
    	
    	
    	
    	 WebDriver driver = new ChromeDriver();
  	     driver.manage().window().maximize();  
  	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  	     driver.get(File_Utility.getDataFromPropertiesFile("url"));
  	     
  	     driver.findElement(By.linkText("Register")).click();
  	     
  	     if(GENDER.equals("male"))
  	     {
  	     driver.findElement(By.id("gender-male")).click();
  	     }
  	     
  	     else 
  	     {
  	    	 driver.findElement(By.id("gender-female")).click();
  	     }
  	     driver.findElement(By.id("FirstName")).sendKeys(FIRSTNAME);
  	     driver.findElement(By.id("LastName")).sendKeys(LASTNAME);
  	     driver.findElement(By.id("Email")).sendKeys(EMAIL);
  	     driver.findElement(By.id("Password")).sendKeys(PASSWORD);
  	     driver.findElement(By.id("ConfirmPassword")).sendKeys(CONFIRMPASSWORD);
  	     
  	     driver.findElement(By.id("register-button")).click();
  	     
    	 
    	
    	
    	
    }
	






}

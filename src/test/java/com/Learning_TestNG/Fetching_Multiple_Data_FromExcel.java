package com.Learning_TestNG;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.general_Utilities.WebDriver_Utility;

public class Fetching_Multiple_Data_FromExcel 
{
    @DataProvider(name="searchData")
	public String[][] searchData() throws EncryptedDocumentException, IOException
    {
    	FileInputStream fis = new FileInputStream("./src/test/resources/data/Register Data.xlsx");
    	Workbook book = WorkbookFactory.create(fis);
    	Sheet sheet = book.getSheet("FlipkartSearch");
    	int rowCount = sheet.getPhysicalNumberOfRows();
    	int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
    	
    	String [][] data = new String [rowCount-1][cellCount];
    			
        for (int i = 1 ; i < rowCount ; i++)
        {
        	for(int j = 0 ; j < cellCount ; j++)
        	{
        	
        	 data[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
        	
        	}
        
        	
        }
		return data;
    }	
    		
  @Test(dataProvider="searchData")
  public void flipkartSearchTest(String search) throws InterruptedException
  {
	  WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.get("https://www.flipkart.com/");
	     Thread.sleep(2000);
	     
	     driver.findElement(By.name("q")).sendKeys(search , Keys.ENTER);
	     Thread.sleep(2000);
	    
	     driver.quit();
  }


}




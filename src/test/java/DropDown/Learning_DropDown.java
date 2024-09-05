package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learning_DropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/search?q=ihone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		 
		 driver.findElement(By.name("q")).sendKeys("Iphone");
		 
		 WebElement minDD = driver.findElement(By.xpath("(//select[@class='Gn+jFg'])[1]"));
		 Select a1 = new Select(minDD);
		 
		 
		 List<WebElement> options =  a1.getOptions();
		 for(WebElement option : options)
		 {
			 System.out.println(option.getText());
		 
   
	//	  if(option.getAttribute("value").equals("15000")    
		 
		 
//		  if(((WebElement) options).getText().equals("₹15000"))
//		  {
//			  a1.selectByVisibleText("₹15000");
//		  }
		 }
	Thread.sleep(2000);
	driver.quit();
	}

	
	
}

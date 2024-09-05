package Suggestion_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestio_Handling 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium");

	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//div[@class='wM6W7d WggQGd']"));
	    
	
	
	}

}

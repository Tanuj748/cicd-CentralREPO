package WebElement_Methods;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class get_Size {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-cn9hf5l/login.do");
		WebElement copy = 	driver.findElement(By.id("loginButton"));
		
	    System.out.println(copy.getSize().getHeight());
	    System.out.println(copy.getSize().getWidth());
	    
	    Thread.sleep(2000);
	    driver.quit();
		
	
	
	}

}

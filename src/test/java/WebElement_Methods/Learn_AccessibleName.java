package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_AccessibleName {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://desktop-cn9hf5l/login.do");
		
		WebElement copy = 	driver.findElement(By.id("loginButton"));
		
		System.out.println(copy.getAccessibleName());
		
	}

}

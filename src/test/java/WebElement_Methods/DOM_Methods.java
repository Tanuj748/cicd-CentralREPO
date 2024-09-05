package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DOM_Methods {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://desktop-cn9hf5l/login.do");
		
	WebElement copy = 	driver.findElement(By.id("loginButton"));
	
	System.out.println(copy.getAttribute("id"));
	System.out.println((copy.getDomAttribute("class")));
	System.out.println((copy.getDomProperty("href")));
		
	Thread.sleep(2000);
	driver.quit();
		
		
	}

}

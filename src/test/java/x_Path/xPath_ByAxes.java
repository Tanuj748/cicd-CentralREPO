package x_Path;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath_ByAxes {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		String name = driver.findElement(By.xpath("//a[text()='IAIR H15 White in Ear Wired Headphones with Mic Wired G...']")).getText();
		System.out.println(name);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

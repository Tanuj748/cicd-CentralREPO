package x_Path;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath_ByLogical_Operators 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://desktop-cn9hf5l/login.do");
		
		driver.findElement(By.xpath("//input[@class='textField' and @type = 'text']")).sendKeys("admin");
		
		
		
	}

}

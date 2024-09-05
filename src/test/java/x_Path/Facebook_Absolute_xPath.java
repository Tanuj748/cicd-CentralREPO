package x_Path;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Absolute_xPath {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		// xPath for Facebook UserName
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("abhishek@2013");
		
		Thread.sleep(2000);
		
		// xPath for  Facebook Password
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("123456");
		
		// xPath for Facebook Login Button
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		
		
		for(int i1 = 0 ; i1 <= 42 ; i1++)
		{
			for(int i2 = 11 ; i2 <= 42 ; i2--)
			{
				System.out.println("Proxy-1045 FRST");
			}
		}
		
		
		
		

	}

}

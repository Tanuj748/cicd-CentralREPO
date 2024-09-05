package Switch_Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Switch_Window_Assignment {
public static void main(String[] args) throws InterruptedException 
{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Iphone14" , Keys.ENTER); 
		
		String Parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//div[text()='Apple iPhone 14 Plus (Blue, 128 GB)']")).click();
		
		Set<String> child = driver.getWindowHandles(); 
		child.remove(Parent);
		
		for(String ID : child)
		{
			driver.switchTo().window(ID);
			Thread.sleep(2000);
			String w1 = driver.findElement(By.xpath("//span[text()='Apple iPhone 14 Plus (Blue, 128 GB)']")).getText();
			System.out.println(w1);
			
			 driver.findElement(By.xpath("//span[text()='Apple iPhone 14 Plus (Blue, 128 GB)']/../../.."));
			 String w2 =  driver.findElement(By.xpath("//div[@class='Nx9bqj CxhGGd']")).getText();
			 System.out.println(w2);
			 driver.close();
		}
		
		driver.switchTo().window(Parent);
		String w3 = driver.findElement(By.xpath("//div[text()='Apple iPhone 14 Plus (Blue, 128 GB)']")).getText();
		System.out.println(w3);
		
		driver.findElement(By.xpath("//div[text()='Apple iPhone 14 Plus (Blue, 128 GB)']/../.."));
		String w4 = driver.findElement(By.xpath("(//div[@class='Nx9bqj _4b5DiR'])[1]")).getText();
		System.out.println(w4);
		driver.close();
      }
}




		
			
		

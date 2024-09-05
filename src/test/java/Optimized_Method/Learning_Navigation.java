package Optimized_Method;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Navigation {

	public static void main(String[] args)  throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/login");
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.myntra.com/checkout/cart");
		Thread.sleep(2000);
		driver.navigate().to("https://www.myntra.com/login");

	}

}

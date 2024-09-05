package com.Learning_Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learning_ScrollToElement_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions action = new Actions(driver);
		action.scrollToElement(driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"))).perform();
		action.click(driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"))).perform();
		

	}

}

package com.Learning_Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learning_Click_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		
		action.moveToElement((WebElement) By.xpath("//div[@class='H6-NpN _3N4_BX']")).perform();
		action.moveToElement((WebElement) By.xpath("//li[text()='My Profile']")).click().perform();
		
	}

}

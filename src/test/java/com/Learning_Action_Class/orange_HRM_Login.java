package com.Learning_Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orange_HRM_Login {

	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         Thread.sleep(1000);
		 driver.findElement(By.name("username")).sendKeys("Admin");
		
		 driver.findElement(By.name("password")).sendKeys("admin123");
		
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	}

}

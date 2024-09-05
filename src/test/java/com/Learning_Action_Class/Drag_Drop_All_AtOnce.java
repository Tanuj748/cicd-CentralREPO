package com.Learning_Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_All_AtOnce {     //Multiple DragDrops {to be complete in 04 Lines only}
public static void main(String[] args) throws InterruptedException 
	{
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		Thread.sleep(2000);
		
		
//		action.dragAndDrop(driver.findElement(By.id("box1")), driver.findElement(By.id("box101"))).dragAndDrop(driver.findElement(By.id("box2")),driver.findElement(By.id("box102"))).dragAndDrop(driver.findElement(By.id("box3")), driver.findElement(By.id("box103"))).dragAndDrop(driver.findElement(By.id("box4")), driver.findElement(By.id("box104"))).dragAndDrop(driver.findElement(By.id("box5")), driver.findElement(By.id("box105"))).dragAndDrop(driver.findElement(By.id("box6")), driver.findElement(By.id("box106"))).dragAndDrop(driver.findElement(By.id("box7")), driver.findElement(By.id("box107"))).perform();
//		Thread.sleep(2000);
//		action.dragAndDrop(driver.findElement(By.id("box101")), driver.findElement(By.id("capitals"))).dragAndDrop(driver.findElement(By.id("box102")), driver.findElement(By.id("capitals"))).dragAndDrop(driver.findElement(By.id("box103")), driver.findElement(By.id("capitals"))).dragAndDrop(driver.findElement(By.id("box104")), driver.findElement(By.id("capitals"))).dragAndDrop(driver.findElement(By.id("box105")),driver.findElement(By.id("capitals"))).dragAndDrop(driver.findElement(By.id("box106")), driver.findElement(By.id("capitals"))).dragAndDrop(driver.findElement(By.id("box107")), driver.findElement(By.id("capitals"))).perform();
	
		
		Actions action = new Actions(driver);
		for(int i = 1 ; i <= 7 ; i++)
		{
			action.dragAndDrop(driver.findElement(By.id("box" + 1)), driver.findElement(By.id("box10"+1)));
		}
		
	
	}

}

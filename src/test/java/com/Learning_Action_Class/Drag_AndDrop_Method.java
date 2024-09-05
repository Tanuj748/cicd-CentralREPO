package com.Learning_Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_AndDrop_Method {

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		
		
		Actions action = new Actions (driver);
		
		for(int i = 1 ; i <= 7 ; i++)
		    {
		   	action.dragAndDrop(driver.findElement(By.id("box"+i)), driver.findElement(By.id("box10"+i))).perform();
		    Thread.sleep(2000);
		     }
		
		    for(int i1 = 1 ; i1 <= 7 ; i1++) 
		    {
		    action.dragAndDrop(driver.findElement(By.id("box" + i1)), driver.findElement(By.id("capitals"))).perform();
		    Thread.sleep(2000);
		    }
		
	
		
		}
	}
	

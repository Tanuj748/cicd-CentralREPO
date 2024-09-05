package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learning_MultiSelect_Dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		
		 WebElement options = driver.findElement(By.xpath("//select[@name='Month']"));
		 
		 Select  a1 = new Select(options);
		 System.out.println(a1.isMultiple());
		 
		 a1.selectByIndex(2);
		 Thread.sleep(1000);
		 a1.selectByValue("Ap");
		 Thread.sleep(1000);
		 a1.selectByVisibleText("November");
		 
		 List<WebElement> sel = a1.getAllSelectedOptions();
		 for (WebElement sel1 : sel)
		 {
			 System.out.println(sel1.getText());
		 }
		 
		 
		 
		 
		 
		 

	}

}

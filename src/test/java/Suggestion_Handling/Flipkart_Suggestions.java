package Suggestion_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Suggestions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Trimmer");
		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='YGcVZO _2VHNef']"));
		
		for(WebElement element : suggestions)
		{
			System.out.println(element.getText());
		}
	
	    for(int i = 0 ; i < suggestions.size();i++)
	    {
	    	WebElement element = suggestions.get(i);
	        if(element.getText().equals("trimmer charger cable"))
	        {
	        	element.click();
	        	break;
	        }
	    }
	
	
	
	
	}

}

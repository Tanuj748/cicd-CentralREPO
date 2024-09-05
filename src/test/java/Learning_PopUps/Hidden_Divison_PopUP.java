package Learning_PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Divison_PopUP {

	public static void main(String[] args) throws InterruptedException 
	{
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://desktop-cn9hf5l/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@href='/tasks/otasklist.do\']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
       Thread.sleep(2000);
     
     driver.findElement(By.name("customers[1]")).click();
     //driver.findElement("//input[@value='Delete Selected']").click();
     
	}

}

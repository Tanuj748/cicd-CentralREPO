package WebElement_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class All_WEM_OlaCabs {
public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.olacabs.com/auth/login");
		WebElement button = driver.findElement(By.xpath("//input[@value='Let me in']"));
	    
		System.out.println(button.getAccessibleName());         //1
	    System.out.println(button.getAriaRole());               //2
	    System.out.println(button.getTagName());                //3
     	System.out.println(button.getSize().getHeight());      //4
		System.out.println(button.getSize().getWidth());
		
		System.out.println(button.getLocation().getX());   //5
		System.out.println(button.getLocation().getY());
	    
		System.out.println(button.getRect().getHeight());  //6
		System.out.println(button.getRect().getWidth());
		System.out.println(button.getRect().getX());
		System.out.println(button.getRect().getY());
		
		System.out.println(button.getAttribute("type"));  //7
	    System.out.println(button.getCssValue("height"));  //8
	    System.out.println(button.getDomProperty("value")); //9
	    System.out.println(button.getDomAttribute("value")); //10
		
		
	WebElement displayed = driver.findElement(By.xpath("//label[text()='Password : ']"));
	System.out.println(displayed.isDisplayed());   //11

	
	driver.findElement(By.name("login")).sendKeys(""); //12
	driver.findElement(By.id("password")).sendKeys("");
	driver.findElement(By.xpath("//input[@value='Let me in']")).submit(); //13
	driver.findElement(By.xpath("//input[@value='Let me in']")).click();  //14
	
	WebElement checkbox = driver.findElement(By.id("remember"));
	System.out.println(checkbox.isSelected()); //15
	
	WebElement tz = driver.findElement(By.name("login"));
	tz.sendKeys("cucumber framework");
	Thread.sleep(2000);
	tz.clear();   //16
	
	
	
	
	
	
	
	
	
		
		

        	
		
		
		

	}

}

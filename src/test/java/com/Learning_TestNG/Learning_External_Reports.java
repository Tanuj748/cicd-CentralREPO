package com.Learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Learning_External_Reports 
{

	@Test
	public void loginTest() throws InterruptedException
	{
		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\ADMIN\\Desktop\\QJU-SJFVD-E1");
		
		ExtentReports report = new ExtentReports();
		
		report.attachReporter(spark);
		
		ExtentTest test = report.createTest("Login Test");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		test.log(Status.INFO, "Welcome Page displayed Successfully");
		
		driver.findElement(By.linkText("Log in")).click();
		
		test.log(Status.INFO, "Login Page displayed Successfully");
		driver.findElement(By.id("Email")).sendKeys("tanishbarwal2024@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123321123");
		
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		String screenshot = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(screenshot);
		
		test.log(Status.PASS, "Home Page is Displayed Successfully");
		Thread.sleep(2000);
		driver.quit();
		report.flush();
	}
	
	

















}

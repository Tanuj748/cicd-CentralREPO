package com.Launching_Empty_Browsers;

import java.util.Scanner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Launching_Multiple_Browsers {
public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the valid key for invoking the desired browser");
		System.out.println("Enter 1 for Chrome Browser");
		System.out.println("Enter 2 for Microsoft edge Browser");
		System.out.println("Enter 3 for Firefox Browser");
		
		int i1  = sc.nextInt();
		
		if( i1 == 1)
		{
			new ChromeDriver();
		}

		if(i1==2)
		{
			new EdgeDriver();
		}
	
	    if(i1==3)
	    {
	    	new FirefoxDriver();
	    }
	    else
	    {
	    	new ChromeDriver();
	    }
	
	} 
	}

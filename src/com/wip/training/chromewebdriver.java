package com.wip.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class chromewebdriver {

	public static void main(String[] args) {
		// TODO 
		 //System.setProperty("webdriver.gecko.driver",
			       // "/Users/kattaa/Downloads/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/kattaa/Downloads/chromedriver");


		WebDriver driver  = new ChromeDriver();
		driver.navigate().to("http://google.com");
		String appTitle = driver.getTitle();
		System.out.println("Application title is :: "+appTitle);
		driver.quit();
	
	}

}

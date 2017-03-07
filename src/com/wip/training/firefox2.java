package com.wip.training;

import java.util.concurrent.TimeUnit;

// package com.lang.firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class firefox2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.setProperty("webdriver.gecko.driver", "/Users/sudhakatta/Downloads/geckodriver");

    WebDriver driver = new FirefoxDriver();
    driver.get("http://www.github.com");
    driver.manage().window().maximize();


    WebElement linkElement = driver.findElement(By.linkText("Sign in"));
    linkElement.click();
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

    
    WebElement userName = driver.findElement(By.id("login_field"));
    userName.sendKeys("iamsudha");
    WebElement password = driver.findElement(By.id("password"));
    password.sendKeys("shr1ya02");
    WebElement linkElement1 = driver.findElement(By.className("btn"));
    linkElement1.click();
    driver.close();
     
  }

}

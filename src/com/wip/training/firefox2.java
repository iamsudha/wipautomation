package com.wip.training;

//package com.lang.firefox;

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
    String  var1=driver.getTitle();
    System.out.println(var1);
    
    String currurl=driver.getCurrentUrl();
    System.out.println(currurl);
    
    String pgsrc=driver.getPageSource();
    //System.out.println(pgsrc);
    
    //findElement, then pass by strategy, webelement instance linkElement;
    
    WebElement linkElement = driver.findElement(By.linkText("Sign in"));
    linkElement.click();
    //linkElement.getTagName();
    //WebElement linkElement2 = driver.findElement(By.className("alt-h1"));
   // linkElement2.getText();
  WebElement linkElement3 = driver.findElement(By.className("form"));
     linkElement3.sendKeys("iamsudha");
   /* WebElement email = driver.findElement(By.id("login"));
    Actions builder = new Actions(driver);
    Actions seriesOfActions = builder.moveToElement(email).click().sendKeys(email, "gati.naveen@gmail.com");
    seriesOfActions.perform();*/
    
    //driver.close();
  }

}

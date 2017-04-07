package com.wip.training.types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.wip.training.inheritance.Animal;

public class main {
	public WebDriver playdriver;

	public static void main(String[] args) {

		rectangle rect = new rectangle(30, 40);
		rect.printDetails();
		System.out.println("Area of the rectangle is: " + rect.area());
		Kitten kit = new Kitten();

		// kitten inherits all the methods of both animal and also
		// cat which inturn extends animal class but not walking as it is
		// protected, inspite of belonging to a
		// different package
		//walking is accessed as part of another subclass KittenProtected belonging to a diff package
		//as it directly extends animal
	
		kit.eating();
		kit.scream();
		// kit.walking();
		/*
		 * load play.google.com 2.go to apps page 3.select categories dropdown
		 */
		System.setProperty("webdriver.chrome.driver", "/Users/sudhakatta/Downloads/chromedriver");
		WebDriver playdriver = new ChromeDriver();
		GPlay gplayhome = new GPlay(playdriver);
		gplayhome.load(playdriver);
		WebElement appslink = playdriver.findElement(By.className("apps"));
		appslink.click();
		Select dropdown = new Select(playdriver.findElement(By.className("action-bar-dropdown-top")));
		dropdown.selectByVisibleText("Android Wear");
		/*
		 * WebElement catdropdown =
		 * playdriver.findElement(By.className("title").linkText("Categories"));
		 * catdropdown.click();
		 */

	}

}

package com.wip.training.types;

import org.openqa.selenium.WebDriver;

public class GPlay {
	public WebDriver playdriver;
	
	public GPlay(WebDriver playdriver) {
		this.playdriver = playdriver;
	}
	
	public void load(WebDriver playdriver) {
	playdriver.get("https://play.google.com/store");
	}

}

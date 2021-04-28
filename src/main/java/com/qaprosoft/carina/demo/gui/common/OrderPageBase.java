package com.qaprosoft.carina.demo.gui.common;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.demo.gui.BasePage;

public abstract class OrderPageBase extends BasePage {
	public OrderPageBase(WebDriver driver) {
		super(driver);
	}
	
	public abstract LoginPageBase clickProceedButton();

}

package com.qaprosoft.carina.demo.gui.common;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.demo.gui.BasePage;

public abstract class AddressPageBase extends BasePage{
	public AddressPageBase(WebDriver driver) {
		super(driver);
	}
	
	public abstract ShippingPageBase clickProceedButton();
}

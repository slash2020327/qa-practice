package com.qaprosoft.carina.demo.gui.common;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.demo.gui.BasePage;

public abstract class ShippingPageBase extends BasePage {
	public ShippingPageBase(WebDriver driver) {
		super(driver);
		setPageURL("?controller=order");
	}
	
	public abstract PaymentPageBase clickProceedButton();
}

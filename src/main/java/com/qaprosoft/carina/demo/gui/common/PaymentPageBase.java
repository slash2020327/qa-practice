package com.qaprosoft.carina.demo.gui.common;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.demo.gui.BasePage;

public abstract class PaymentPageBase extends BasePage {
	public PaymentPageBase(WebDriver driver) {
		super(driver);
		setPageURL("?controller=order&multi-shipping=");
	}
	
	public abstract OrderSummaryPageBase clickWireButton();
}

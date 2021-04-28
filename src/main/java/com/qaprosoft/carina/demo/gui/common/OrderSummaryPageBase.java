package com.qaprosoft.carina.demo.gui.common;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.demo.gui.BasePage;

public abstract class OrderSummaryPageBase extends BasePage {
	public OrderSummaryPageBase(WebDriver driver) {
		super(driver);
	}
	
	public abstract ConfirmedOrderPageBase clickWireButton();
}

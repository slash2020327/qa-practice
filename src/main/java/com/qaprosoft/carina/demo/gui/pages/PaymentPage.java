package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class PaymentPage extends BasePage{
	@FindBy(xpath="//a[@class='bankwire']")
	private ExtendedWebElement wireButton;

	public PaymentPage(WebDriver driver) {
		super(driver);
		setPageURL("?controller=order&multi-shipping=");
	}
	
	public OrderSummaryPage clickWireButton() {
		wireButton.click();
		return new OrderSummaryPage(driver);
	}

}

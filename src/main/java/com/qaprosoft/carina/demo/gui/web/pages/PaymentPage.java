package com.qaprosoft.carina.demo.gui.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.BasePage;

public class PaymentPage extends HomeBasePage {
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

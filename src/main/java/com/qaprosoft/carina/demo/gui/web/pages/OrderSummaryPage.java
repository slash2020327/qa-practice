package com.qaprosoft.carina.demo.gui.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.BasePage;

public class OrderSummaryPage extends HomeBasePage {
	@FindBy(xpath="//span[contains(text(),'I confirm my order')]")
	private ExtendedWebElement confirmButton;

	public OrderSummaryPage(WebDriver driver) {
		super(driver);
		setPageURL("?fc=module&module=bankwire&controller=payment");
	}
	
	public ConfirmedOrderPage clickWireButton() {
		confirmButton.click();
		return new ConfirmedOrderPage(driver);
	}

}

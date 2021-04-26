package com.qaprosoft.carina.demo.gui.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.BasePage;

public class OrderPage extends HomeBasePage {
	@FindBy(xpath="//a[contains(@class, 'standard-checkout')]")
	private ExtendedWebElement proceedButton;

	public OrderPage(WebDriver driver) {
		super(driver);
		setPageURL("?controller=order");
	}
	
	public LoginPage clickProceedButton() {
		proceedButton.click();
		return new LoginPage(driver);
	}

}

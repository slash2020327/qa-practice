package com.qaprosoft.carina.demo.gui.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.BasePage;

public class ShippingPage extends HomeBasePage {
	@FindBy(xpath="//input[@id='cgv']")
	private ExtendedWebElement agreeButton;
	
	@FindBy(xpath="//button[contains(@class, 'standard-checkout')]")
	private ExtendedWebElement proceedButton;

	public ShippingPage(WebDriver driver) {
		super(driver);
		setPageURL("?controller=order");
	}
	
	public PaymentPage clickProceedButton() {
		agreeButton.click();
		proceedButton.click();
		return new PaymentPage(driver);
	}

}

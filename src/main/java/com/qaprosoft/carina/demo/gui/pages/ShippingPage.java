package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class ShippingPage extends BasePage{
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
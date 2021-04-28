package com.qaprosoft.carina.demo.gui.pages.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.common.PaymentPageBase;
import com.qaprosoft.carina.demo.gui.common.ShippingPageBase;

public class ShippingPage extends ShippingPageBase {
	@FindBy(xpath="//input[@id='cgv']")
	private ExtendedWebElement agreeButton;
	
	@FindBy(xpath="//button[contains(@class, 'standard-checkout')]")
	private ExtendedWebElement proceedButton;

	public ShippingPage(WebDriver driver) {
		super(driver);
		setPageURL("?controller=order");
	}
	
	public PaymentPageBase clickProceedButton() {
		agreeButton.click();
		proceedButton.click();
		return initPage(getDriver(), PaymentPageBase.class);
	}

}

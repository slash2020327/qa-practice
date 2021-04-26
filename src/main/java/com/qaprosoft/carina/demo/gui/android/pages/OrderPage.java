package com.qaprosoft.carina.demo.gui.android.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomeBasePage.class)
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

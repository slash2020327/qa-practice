package com.qaprosoft.carina.demo.gui.android.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomeBasePage.class)
public class ConfirmedOrderPage extends HomeBasePage {
	@FindBy(xpath="//strong[contains(text(),'Your order')]")
	private ExtendedWebElement infoMessage;
	

	public ConfirmedOrderPage(WebDriver driver) {
		super(driver);
		setPageURL("?controller=order-confirmation&$ignore");
	}
	
	public ExtendedWebElement getInfoMessage() {
		return infoMessage;
	}
	
}

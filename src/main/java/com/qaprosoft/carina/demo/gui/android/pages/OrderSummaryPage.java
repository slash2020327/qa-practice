package com.qaprosoft.carina.demo.gui.android.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomeBasePage.class)
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

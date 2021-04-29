package com.qaprosoft.carina.demo.gui.pages.android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.common.OrderSummaryPageBase;
import com.qaprosoft.carina.demo.gui.common.PaymentPageBase;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PaymentPageBase.class)
public class PaymentPage extends PaymentPageBase {
	@FindBy(xpath="//a[@class='bankwire']")
	private ExtendedWebElement wireButton;

	public PaymentPage(WebDriver driver) {
		super(driver);
		setPageURL("?controller=order&multi-shipping=");
	}
	
	@Override
	public OrderSummaryPageBase clickWireButton() {
		wireButton.click();
		return initPage(getDriver(), OrderSummaryPageBase.class);
	}

}

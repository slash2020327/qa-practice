package com.qaprosoft.carina.demo.gui.pages.android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.common.PaymentPageBase;
import com.qaprosoft.carina.demo.gui.common.ShippingPageBase;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ShippingPageBase.class)
public class ShippingPage extends ShippingPageBase {
	@FindBy(xpath="//input[@id='cgv']")
	private ExtendedWebElement agreeButton;
	
	@FindBy(xpath="//button[contains(@class, 'standard-checkout')]")
	private ExtendedWebElement proceedButton;

	public ShippingPage(WebDriver driver) {
		super(driver);
		setPageURL("?controller=order");
	}
	@Override
	public PaymentPageBase clickProceedButton() {
		agreeButton.click();
		proceedButton.click();
		return initPage(getDriver(), PaymentPageBase.class);
//		return new PaymentPage(driver);
	}

}

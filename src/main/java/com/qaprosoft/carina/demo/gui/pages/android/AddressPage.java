package com.qaprosoft.carina.demo.gui.pages.android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.common.AddressPageBase;
import com.qaprosoft.carina.demo.gui.common.ShippingPageBase;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = AddressPageBase.class)
public class AddressPage extends AddressPageBase {
	@FindBy(xpath="//button[@name='processAddress']")
	private ExtendedWebElement proceedButton;

	public AddressPage(WebDriver driver) {
		super(driver);
		setPageURL("?controller=order&step=1&$ignore");
	}
	
	@Override
	public ShippingPageBase clickProceedButton() {
		proceedButton.click();
		return initPage(getDriver(), ShippingPageBase.class);
	}

}

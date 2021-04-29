package com.qaprosoft.carina.demo.gui.pages.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.common.ConfirmedOrderPageBase;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = ConfirmedOrderPageBase.class)
public class ConfirmedOrderPage extends ConfirmedOrderPageBase {
	@FindBy(xpath="//strong[contains(text(),'Your order')]")
	private ExtendedWebElement infoMessage;
	
	public ConfirmedOrderPage(WebDriver driver) {
		super(driver);
		setPageURL("?controller=order-confirmation&$ignore");
	}
	
	@Override
	public ExtendedWebElement getInfoMessage() {
		return infoMessage;
	}
}

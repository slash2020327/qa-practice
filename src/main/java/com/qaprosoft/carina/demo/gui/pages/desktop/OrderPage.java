package com.qaprosoft.carina.demo.gui.pages.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.common.LoginPageBase;
import com.qaprosoft.carina.demo.gui.common.OrderPageBase;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = OrderPageBase.class)
public class OrderPage extends OrderPageBase {
	@FindBy(xpath="//a[contains(@class, 'standard-checkout')]")
	private ExtendedWebElement proceedButton;

	public OrderPage(WebDriver driver) {
		super(driver);
		setPageURL("?controller=order");
	}
	
	@Override
	public LoginPageBase clickProceedButton() {
		proceedButton.click();
		return initPage(getDriver(), LoginPageBase.class);
	}
}

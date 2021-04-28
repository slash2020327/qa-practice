package com.qaprosoft.carina.demo.gui.pages.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.common.AddressPageBase;
import com.qaprosoft.carina.demo.gui.common.ShippingPageBase;

public class AddressPage extends AddressPageBase {
	@FindBy(xpath="//button[@name='processAddress']")
	private ExtendedWebElement proceedButton;

	public AddressPage(WebDriver driver) {
		super(driver);
		setPageURL("?controller=order&step=1&$ignore");
	}
	
	public ShippingPageBase clickProceedButton() {
		proceedButton.click();
		return initPage(getDriver(), ShippingPageBase.class);
	}

}

package com.qaprosoft.carina.demo.gui.pages.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.common.OrderSummaryPageBase;
import com.qaprosoft.carina.demo.gui.common.PaymentPageBase;

public class PaymentPage extends PaymentPageBase {
	@FindBy(xpath="//a[@class='bankwire']")
	private ExtendedWebElement wireButton;

	public PaymentPage(WebDriver driver) {
		super(driver);
		setPageURL("?controller=order&multi-shipping=");
	}
	
	public OrderSummaryPageBase clickWireButton() {
		wireButton.click();
		return initPage(getDriver(), OrderSummaryPageBase.class);
	}

}

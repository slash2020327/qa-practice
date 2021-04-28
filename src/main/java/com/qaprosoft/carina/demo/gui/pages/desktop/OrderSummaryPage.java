package com.qaprosoft.carina.demo.gui.pages.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.common.ConfirmedOrderPageBase;
import com.qaprosoft.carina.demo.gui.common.OrderSummaryPageBase;

public class OrderSummaryPage extends OrderSummaryPageBase {
	@FindBy(xpath="//span[contains(text(),'I confirm my order')]")
	private ExtendedWebElement confirmButton;

	public OrderSummaryPage(WebDriver driver) {
		super(driver);
		setPageURL("?fc=module&module=bankwire&controller=payment");
	}
	
	public ConfirmedOrderPageBase clickWireButton() {
		confirmButton.click();
		return initPage(getDriver(), ConfirmedOrderPageBase.class);
	}

}
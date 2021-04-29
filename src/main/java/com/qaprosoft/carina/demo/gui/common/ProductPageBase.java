package com.qaprosoft.carina.demo.gui.common;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.BasePage;

public abstract class ProductPageBase extends BasePage {	
	public ProductPageBase(WebDriver driver) {
		super(driver);
	}
	
	public abstract ProductPageBase selectRandomColor();
	
	public abstract ProductPageBase selectRandomSize();
	
	public abstract ProductPageBase addProduct();
	
	public abstract ExtendedWebElement getOkIcon();
	
	public abstract OrderPageBase clickProceedButton();
}

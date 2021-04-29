package com.qaprosoft.carina.demo.gui.components.android;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.components.common.AccountItem;

public class AndroidAccountItem extends AccountItem{
	@FindBy(xpath = "//h1[@class='page-heading']")
    private ExtendedWebElement accountItem;
	
	public AndroidAccountItem(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
}

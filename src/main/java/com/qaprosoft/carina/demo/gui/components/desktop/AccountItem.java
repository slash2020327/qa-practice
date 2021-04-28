package com.qaprosoft.carina.demo.gui.components.desktop;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.BaseItem;

public class AccountItem extends BaseItem{
	@FindBy(xpath = "//h1[@class='page-heading']")
    private ExtendedWebElement accountItem;
	
	public AccountItem(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
}

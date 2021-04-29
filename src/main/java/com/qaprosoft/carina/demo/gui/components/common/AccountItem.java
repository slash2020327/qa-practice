package com.qaprosoft.carina.demo.gui.components.common;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.foundation.utils.factory.ICustomTypePageFactory;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public abstract class AccountItem extends AbstractUIObject implements ICustomTypePageFactory{
	
	public AccountItem(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
}

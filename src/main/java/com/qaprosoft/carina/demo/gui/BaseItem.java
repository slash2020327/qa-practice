package com.qaprosoft.carina.demo.gui;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.foundation.utils.factory.ICustomTypePageFactory;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class BaseItem extends AbstractUIObject implements ICustomTypePageFactory {

	public BaseItem(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
}

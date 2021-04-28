package com.qaprosoft.carina.demo.gui.common;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.demo.gui.BasePage;
import com.qaprosoft.carina.demo.gui.components.android.HeaderItem;


public abstract class HomeBasePageBase extends BasePage{
	public HomeBasePageBase(WebDriver driver) {
		super(driver);
	}

	public abstract HeaderItem getHeader();
}

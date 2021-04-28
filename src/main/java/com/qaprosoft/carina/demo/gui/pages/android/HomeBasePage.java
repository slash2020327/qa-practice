package com.qaprosoft.carina.demo.gui.pages.android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.demo.gui.components.android.HeaderItem;
import com.qaprosoft.carina.demo.gui.common.HomeBasePageBase;


public class HomeBasePage extends HomeBasePageBase{
	

	public HomeBasePage(WebDriver driver) {
		super(driver);
	}

	public HeaderItem getHeader() {
		return header;
	}

}

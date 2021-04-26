package com.qaprosoft.carina.demo.gui.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.demo.gui.BasePage;
import com.qaprosoft.carina.demo.gui.web.components.HeaderItem;

public class HomeBasePage extends BasePage{
	@FindBy(xpath = "//header")
    private HeaderItem header;

	public HomeBasePage(WebDriver driver) {
		super(driver);
	}

	public HeaderItem getHeader() {
		return header;
	}

}

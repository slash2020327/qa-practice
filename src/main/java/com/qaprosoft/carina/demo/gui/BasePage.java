package com.qaprosoft.carina.demo.gui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.android.HeaderItem;

public abstract class BasePage extends AbstractPage {
	@FindBy(xpath = "//header")
    private HeaderItem header;
	
    public BasePage(WebDriver driver) {
        super(driver);
    }
    
    public HeaderItem getHeader() {
		return header;
	}
}

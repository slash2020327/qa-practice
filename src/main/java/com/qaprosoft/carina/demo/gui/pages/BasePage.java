package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.HeaderItem;

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

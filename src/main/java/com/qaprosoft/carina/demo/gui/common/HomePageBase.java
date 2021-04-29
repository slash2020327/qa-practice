package com.qaprosoft.carina.demo.gui.common;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.demo.gui.BasePage;

public abstract class HomePageBase extends BasePage {
	public HomePageBase(WebDriver driver) {
		super(driver);
	}
    
    public abstract List<?> getProducts();
}

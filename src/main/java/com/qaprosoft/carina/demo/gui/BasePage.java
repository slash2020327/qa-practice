package com.qaprosoft.carina.demo.gui;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class BasePage extends AbstractPage {
    
    public BasePage(WebDriver driver) {
        super(driver);
    }
}

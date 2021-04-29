package com.qaprosoft.carina.demo.gui.common;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.BasePage;

import org.openqa.selenium.WebDriver;

public abstract class AccountPageBase extends BasePage {
    public AccountPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract ExtendedWebElement findInfoMessage();
}

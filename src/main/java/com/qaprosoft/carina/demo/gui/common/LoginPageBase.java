package com.qaprosoft.carina.demo.gui.common;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.demo.gui.BasePage;
import com.qaprosoft.carina.demo.gui.components.common.LoginItem;
import com.qaprosoft.carina.demo.gui.components.common.RegistrationItem;


public abstract class LoginPageBase extends BasePage {
    public LoginPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract RegistrationItem getRegistrationItem();

    public abstract LoginItem getLoginItem();
}



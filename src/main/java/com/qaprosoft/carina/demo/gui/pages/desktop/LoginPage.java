package com.qaprosoft.carina.demo.gui.pages.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.demo.gui.components.desktop.LoginItem;
import com.qaprosoft.carina.demo.gui.components.desktop.RegistrationItem;
import com.qaprosoft.carina.demo.gui.pages.android.HomeBasePage;

public class LoginPage extends HomeBasePage {
    @FindBy(xpath = "//*[@id='create-account_form']")
    private RegistrationItem registrationItem;

    @FindBy(xpath = "//form[@id='login_form']")
    private LoginItem loginItem;

    public LoginPage(WebDriver driver) {
        super(driver);
        setPageURL("?controller=authentication&$ignore");
    }

    public RegistrationItem getRegistrationItem() {
        return registrationItem;
    }

    public LoginItem getLoginItem() {
        return loginItem;
    }
}



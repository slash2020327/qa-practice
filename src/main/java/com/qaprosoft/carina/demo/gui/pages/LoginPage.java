package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.demo.gui.components.RegistrationItem;
import com.qaprosoft.carina.demo.gui.components.LoginItem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//*[@id='create-account_form']")
    private RegistrationItem registrationItem;

    @FindBy(xpath = "//form[@id='login_form']")
    private LoginItem loginItem;

    public LoginPage(WebDriver driver) {
        super(driver);
        setPageURL("?controller=authentication&back=my-account");
    }

    public RegistrationItem getRegistrationItem() {
        return registrationItem;
    }

    public LoginItem getLoginItem() {
        return loginItem;
    }
}



package com.qaprosoft.carina.demo.gui.web.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.web.pages.AccountPage;
import com.qaprosoft.carina.demo.gui.web.pages.AddressPage;

public class LoginItem extends AbstractUIObject {

    @FindBy(xpath = "//input[@id='email']")
    private ExtendedWebElement inputEmail;

    @FindBy(xpath = "//input[@id='passwd']")
    private ExtendedWebElement inputPassword;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    private ExtendedWebElement loginButton;

    public LoginItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void typeEmail(String email) {
        inputEmail.type(email);
    }

    public void typePassword(String password) {
        inputPassword.type(password);
    }

    public AccountPage confirmWebAccountLogin() {
    	loginButton.click();
        return new AccountPage(driver);
    }
    
    public com.qaprosoft.carina.demo.gui.android.pages.AccountPage confirmAndroidAccountLogin() {
    	loginButton.click();
        return new com.qaprosoft.carina.demo.gui.android.pages.AccountPage(driver);
    }
    
    public AddressPage confirmOrderLogin() {
        loginButton.click();
        return new AddressPage(driver);
    }
    
    
}

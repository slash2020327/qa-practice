package com.qaprosoft.carina.demo.gui.components.desktop;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.BaseItem;
import com.qaprosoft.carina.demo.gui.common.AccountPageBase;
import com.qaprosoft.carina.demo.gui.common.AddressPageBase;

public class LoginItem extends BaseItem {

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

    public AccountPageBase confirmAccountLogin() {
    	loginButton.click();
    	return initPage(getDriver(), AccountPageBase.class);
    }
    
    public AddressPageBase confirmOrderLogin() {
        loginButton.click();
    	return initPage(getDriver(), AddressPageBase.class);
    }
    
    
}

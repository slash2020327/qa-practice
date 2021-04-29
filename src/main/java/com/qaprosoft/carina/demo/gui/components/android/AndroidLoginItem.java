package com.qaprosoft.carina.demo.gui.components.android;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.common.AccountPageBase;
import com.qaprosoft.carina.demo.gui.common.AddressPageBase;
import com.qaprosoft.carina.demo.gui.components.common.LoginItem;

public class AndroidLoginItem extends LoginItem implements IMobileUtils {
    @FindBy(xpath = "//input[@id='email']")
    private ExtendedWebElement inputEmail;

    @FindBy(xpath = "//input[@id='passwd']")
    private ExtendedWebElement inputPassword;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    private ExtendedWebElement loginButton;

    public AndroidLoginItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public void typeEmail(String email) {
        inputEmail.type(email);
    }

    @Override
    public void typePassword(String password) {
        inputPassword.type(password);
    }

    @Override
    public AccountPageBase confirmAccountLogin() {
    	hideKeyboard();
    	loginButton.click();
    	return initPage(getDriver(), AccountPageBase.class);
    }
    
    @Override
    public AddressPageBase confirmOrderLogin() {
    	hideKeyboard();
    	loginButton.click();
    	return initPage(getDriver(), AddressPageBase.class);
    }
    
    
}

package com.qaprosoft.carina.demo.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.AccountCreationPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Authentication extends AbstractUIObject {


    @FindBy(xpath = "//input[@id='email_create']")
    private ExtendedWebElement createEmailField;

    @FindBy(xpath = "//*[@class='icon-user left']")
    private ExtendedWebElement createAccountButton;



    public Authentication(WebDriver driver, SearchContext searchContext){
        super(driver, searchContext);
    }

    public AccountCreationPage registerNewEmailValid(String email){
        createEmailField.type(email);
        createAccountButton.click();
        return new AccountCreationPage(driver);
    }

}

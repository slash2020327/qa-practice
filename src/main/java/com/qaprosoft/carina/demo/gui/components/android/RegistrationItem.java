package com.qaprosoft.carina.demo.gui.components.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.BaseItem;
import com.qaprosoft.carina.demo.gui.common.RegistrationPageBase;
import com.qaprosoft.carina.demo.gui.pages.android.RegistrationPage;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RegistrationItem extends BaseItem {
    @FindBy(xpath = "//input[@id='email_create']")
    private ExtendedWebElement createEmailField;

    @FindBy(xpath = "//*[@class='icon-user left']")
    private ExtendedWebElement createAccountButton;

    public RegistrationItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public RegistrationPageBase registerNewEmailValid(String email) {
        createEmailField.type(email);
        createAccountButton.click();
        return initPage(getDriver(), RegistrationPageBase.class);
//        return new RegistrationPage(driver);
    }
}

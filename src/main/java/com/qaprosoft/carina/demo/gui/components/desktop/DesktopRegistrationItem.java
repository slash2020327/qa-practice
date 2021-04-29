package com.qaprosoft.carina.demo.gui.components.desktop;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.common.RegistrationPageBase;
import com.qaprosoft.carina.demo.gui.components.common.RegistrationItem;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class DesktopRegistrationItem extends RegistrationItem {
    @FindBy(xpath = "//input[@id='email_create']")
    private ExtendedWebElement createEmailField;

    @FindBy(xpath = "//*[@class='icon-user left']")
    private ExtendedWebElement createAccountButton;

    public DesktopRegistrationItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public RegistrationPageBase registerNewEmailValid(String email) {
        createEmailField.type(email);
        createAccountButton.click();
        return initPage(getDriver(), RegistrationPageBase.class);
    }
}

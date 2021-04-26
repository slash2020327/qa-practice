package com.qaprosoft.carina.demo.gui.web.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends HomeBasePage {
    @FindBy(xpath = "//p[@class = 'info-account']")
    private ExtendedWebElement infoMessage;

    public AccountPage(WebDriver driver) {
        super(driver);
        setPageURL("?controller=my-account");
    }

    public ExtendedWebElement findInfoMessage() {
        return infoMessage;
    }
}

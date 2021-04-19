package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {
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

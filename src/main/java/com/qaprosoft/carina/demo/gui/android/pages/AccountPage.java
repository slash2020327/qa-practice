package com.qaprosoft.carina.demo.gui.android.pages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomeBasePage.class)
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

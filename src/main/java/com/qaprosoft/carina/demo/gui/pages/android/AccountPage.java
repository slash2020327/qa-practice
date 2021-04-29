package com.qaprosoft.carina.demo.gui.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.common.AccountPageBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = AccountPageBase.class)
public class AccountPage extends AccountPageBase {
    @FindBy(xpath = "//p[@class = 'info-account']")
    private ExtendedWebElement infoMessage;

    public AccountPage(WebDriver driver) {
        super(driver);
        setPageURL("?controller=my-account");
    }

    @Override
    public ExtendedWebElement findInfoMessage() {
        return infoMessage;
    }
}

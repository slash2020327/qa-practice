package com.qaprosoft.carina.demo.gui.pages.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.gui.common.LoginPageBase;
import com.qaprosoft.carina.demo.gui.components.desktop.DesktopLoginItem;
import com.qaprosoft.carina.demo.gui.components.desktop.DesktopRegistrationItem;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {
    @FindBy(xpath = "//*[@id='create-account_form']")
    private DesktopRegistrationItem registrationItem;

    @FindBy(xpath = "//form[@id='login_form']")
    private DesktopLoginItem loginItem;

    public LoginPage(WebDriver driver) {
        super(driver);
        setPageURL("?controller=authentication&$ignore");
    }

    @Override
    public DesktopRegistrationItem getRegistrationItem() {
        return registrationItem;
    }

    @Override
    public DesktopLoginItem getLoginItem() {
        return loginItem;
    }
}



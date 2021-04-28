package com.qaprosoft.carina.demo.gui.pages.android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.gui.common.LoginPageBase;
import com.qaprosoft.carina.demo.gui.components.android.LoginItem;
import com.qaprosoft.carina.demo.gui.components.android.RegistrationItem;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {
    @FindBy(xpath = "//*[@id='create-account_form']")
    private RegistrationItem registrationItem;

    @FindBy(xpath = "//form[@id='login_form']")
    private LoginItem loginItem;

    public LoginPage(WebDriver driver) {
        super(driver);
        setPageURL("?controller=authentication&$ignore");
    }

    @Override
    public RegistrationItem getRegistrationItem() {
        return registrationItem;
    }

    @Override
    public LoginItem getLoginItem() {
        return loginItem;
    }
}



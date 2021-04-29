package com.qaprosoft.carina.demo.gui.pages.android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.gui.common.LoginPageBase;
import com.qaprosoft.carina.demo.gui.components.android.AndroidLoginItem;
import com.qaprosoft.carina.demo.gui.components.android.AndroidRegistrationItem;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {
    @FindBy(xpath = "//*[@id='create-account_form']")
    private AndroidRegistrationItem registrationItem;

    @FindBy(xpath = "//form[@id='login_form']")
    private AndroidLoginItem loginItem;

    public LoginPage(WebDriver driver) {
        super(driver);
        setPageURL("?controller=authentication&$ignore");
    }

    @Override
    public AndroidRegistrationItem getRegistrationItem() {
        return registrationItem;
    }

    @Override
    public AndroidLoginItem getLoginItem() {
        return loginItem;
    }
}



package com.qaprosoft.carina.demo.gui.android.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.gui.android.components.LoginItem;
import com.qaprosoft.carina.demo.gui.android.components.RegistrationItem;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomeBasePage.class)
public class LoginPage extends HomeBasePage {
    @FindBy(xpath = "//*[@id='create-account_form']")
    private RegistrationItem registrationItem;

    @FindBy(xpath = "//form[@id='login_form']")
    private LoginItem loginItem;

    public LoginPage(WebDriver driver) {
        super(driver);
        setPageURL("?controller=authentication&$ignore");
    }

    public RegistrationItem getRegistrationItem() {
        return registrationItem;
    }

    public LoginItem getLoginItem() {
        return loginItem;
    }
}



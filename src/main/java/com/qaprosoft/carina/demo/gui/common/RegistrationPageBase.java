package com.qaprosoft.carina.demo.gui.common;

import com.qaprosoft.carina.demo.gui.BasePage;

import org.openqa.selenium.WebDriver;

public abstract class RegistrationPageBase extends BasePage {
    public RegistrationPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract RegistrationPageBase typeFirstname(String firstname);

    public abstract RegistrationPageBase typeLastname(String lastname);

    public abstract RegistrationPageBase typePassword(String password);

    public abstract RegistrationPageBase typeAddress(String address);

    public abstract RegistrationPageBase typeCity(String city);

    public abstract RegistrationPageBase selectCountry(String country);

    public abstract RegistrationPageBase selectState(String state);

    public abstract RegistrationPageBase typePostcode(String postcode);

    public abstract RegistrationPageBase typePhone(String phone);

    public abstract RegistrationPageBase typeAddressAlias(String addressAlias);

    public abstract AccountPageBase clickRegisterButton();
}


package com.qaprosoft.carina.demo.gui.android.pages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomeBasePage.class)
public class RegistrationPage extends HomeBasePage {
    @FindBy(xpath = "//input[@id='customer_firstname']")
    private ExtendedWebElement firstnameField;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    private ExtendedWebElement lastnameField;

    @FindBy(xpath = "//input[@id='passwd']")
    private ExtendedWebElement passwordField;

    @FindBy(xpath = "//input[@id='address1']")
    private ExtendedWebElement addressField;

    @FindBy(xpath = "//input[@id='city']")
    private ExtendedWebElement cityField;

    @FindBy(xpath = "//select[@id='id_state']")
    private ExtendedWebElement stateMenu;

    @FindBy(xpath = "//input[@id='postcode']")
    private ExtendedWebElement postcodeField;

    @FindBy(xpath = "//select[@id='id_country']")
    private ExtendedWebElement countryMenu;

    @FindBy(xpath = "//input[@id='phone_mobile']")
    private ExtendedWebElement phoneField;

    @FindBy(xpath = "//input[@id='alias']")
    private ExtendedWebElement addressAliasField;

    @FindBy(xpath = "//*[text()='Register']")
    private ExtendedWebElement registerButton;

    public RegistrationPage(WebDriver driver) {
        super(driver);
        setPageURL("?controller=authentication&back=my-account#account-creation");
    }

    public RegistrationPage typeFirstname(String firstname) {
        firstnameField.type(firstname);
        return new RegistrationPage(driver);
    }

    public RegistrationPage typeLastname(String lastname) {
        lastnameField.type(lastname);
        return new RegistrationPage(driver);
    }

    public RegistrationPage typePassword(String password) {
        passwordField.type(password);
        return new RegistrationPage(driver);
    }

    public RegistrationPage typeAddress(String address) {
        addressField.type(address);
        return new RegistrationPage(driver);
    }

    public RegistrationPage typeCity(String city) {
        cityField.type(city);
        return new RegistrationPage(driver);
    }

    public RegistrationPage selectCountry(String country) {
        countryMenu.select(country);
        return new RegistrationPage(driver);
    }

    public RegistrationPage selectState(String state) {
        stateMenu.select(state);
        return new RegistrationPage(driver);
    }

    public RegistrationPage typePostcode(String postcode) {
        postcodeField.type(postcode);
        return new RegistrationPage(driver);
    }

    public RegistrationPage typePhone(String phone) {
        phoneField.type(phone);
        return new RegistrationPage(driver);
    }

    public RegistrationPage typeAddressAlias(String addressAlias) {
        addressAliasField.type(addressAlias);
        return new RegistrationPage(driver);
    }

    public AccountPage clickRegisterButton() {
        registerButton.click();
        return new AccountPage(driver);
    }
}


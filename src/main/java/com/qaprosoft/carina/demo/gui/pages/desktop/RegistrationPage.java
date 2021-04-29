package com.qaprosoft.carina.demo.gui.pages.desktop;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.common.AccountPageBase;
import com.qaprosoft.carina.demo.gui.common.RegistrationPageBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = RegistrationPageBase.class)
public class RegistrationPage extends RegistrationPageBase {
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

    @Override
    public RegistrationPageBase typeFirstname(String firstname) {
        firstnameField.type(firstname);
        return initPage(getDriver(), RegistrationPageBase.class);
    }

    @Override
    public RegistrationPageBase typeLastname(String lastname) {
        lastnameField.type(lastname);
        return initPage(getDriver(), RegistrationPageBase.class);
    }

    @Override
    public RegistrationPageBase typePassword(String password) {
        passwordField.type(password);
        return initPage(getDriver(), RegistrationPageBase.class);
    }

    @Override
    public RegistrationPageBase typeAddress(String address) {
        addressField.type(address);
        return initPage(getDriver(), RegistrationPageBase.class);
    }

    @Override
    public RegistrationPageBase typeCity(String city) {
        cityField.type(city);
        return initPage(getDriver(), RegistrationPageBase.class);
    }

    @Override
    public RegistrationPageBase selectCountry(String country) {
        countryMenu.select(country);
        return initPage(getDriver(), RegistrationPageBase.class);
    }

    @Override
    public RegistrationPageBase selectState(String state) {
        stateMenu.select(state);
        return initPage(getDriver(), RegistrationPageBase.class);
    }

    @Override
    public RegistrationPageBase typePostcode(String postcode) {
        postcodeField.type(postcode);
        return initPage(getDriver(), RegistrationPageBase.class);
    }

    @Override
    public RegistrationPageBase typePhone(String phone) {
        phoneField.type(phone);
        return initPage(getDriver(), RegistrationPageBase.class);
    }

    @Override
    public RegistrationPageBase typeAddressAlias(String addressAlias) {
        addressAliasField.type(addressAlias);
        return initPage(getDriver(), RegistrationPageBase.class);
    }

    @Override
    public AccountPageBase clickRegisterButton() {
        registerButton.click();
        return initPage(getDriver(), AccountPageBase.class);
    }
}


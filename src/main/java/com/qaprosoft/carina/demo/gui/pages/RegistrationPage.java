package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    @FindBy(xpath = "//input[@id='customer_firstname']")
    private ExtendedWebElement firstnameField;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    private ExtendedWebElement lastnameField;

    @FindBy(xpath = "//input[@id='passwd']")
    private ExtendedWebElement passwordField;

    /*    @FindBy(xpath = "//input[@id='firstname']")
    private ExtendedWebElement adressFirstnameField;

    @FindBy(xpath = "//input[@id='lastname']")
    private ExtendedWebElement adressLastnameField;*/

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

//    public AccountPage registerAccount(String firstname, String lastname, String password, String address, String city, String postcode, String phone, String addressAlias) {
//        firstnameField.type(firstname);
//        lastnameField.type(lastname);
//        passwordField.type(password);
//        addressField.type(address);
//        cityField.type(city);
//        countryMenu.select("United States");
//        stateMenu.select("Alabama");
//        postcodeField.type(postcode);
//        phoneField.type(phone);
//        addressAliasField.type(addressAlias);
//        registerButton.click();
//        return new AccountPage(driver);
//    }

    public void typeFirstname(String firstname){
        firstnameField.type(firstname);
    }

    public void typeLastname(String lastname){
        lastnameField.type(lastname);
    }

    public void typePassword(String password){
        passwordField.type(password);
    }

    public void typeAddress(String address){
        addressField.type(address);
    }

    public void typeCity(String city){
        cityField.type(city);
    }

    public void selectCountry(String country){
        countryMenu.select(country);
    }

    public void selectState(String state){
        stateMenu.select(state);
    }

    public void typePostcode(String postcode){
        postcodeField.type(postcode);
    }

    public void typePhone(String phone){
        phoneField.type(phone);
    }

    public void typeAddressAlias(String addressAlias){
        addressAliasField.type(addressAlias);
    }

    public AccountPage clickRegisterButton(){
        registerButton.click();
        return new AccountPage(driver);
    }











}


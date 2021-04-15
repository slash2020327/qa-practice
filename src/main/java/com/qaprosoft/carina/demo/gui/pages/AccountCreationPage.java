package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AccountCreationPage extends AbstractPage {

    @FindBy(xpath = "//input[@id='customer_firstname']")
    private ExtendedWebElement firstnameField;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    private ExtendedWebElement lastnameField;

    @FindBy(xpath="//input[@id='passwd']")
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
    private ExtendedWebElement aliasField;

    @FindBy(xpath = "//*[text()='Register']")
    private ExtendedWebElement registerButton;





    public AccountCreationPage(WebDriver driver){
        super(driver);
        setPageAbsoluteURL("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
    }

    public MyAccountPage registerAccount(String firstname, String lastname, String password, String address, String city, String postcode, String mobile, String addressAlias){
        firstnameField.type(firstname);
        lastnameField.type(lastname);
        passwordField.type(password);
        addressField.type(address);
        cityField.type(city);
        countryMenu.select("United States");
        stateMenu.select("Alabama");
        postcodeField.type(postcode);
        phoneField.type(mobile);
        aliasField.type(addressAlias);
        registerButton.click();
        return new MyAccountPage(driver);
    }








}


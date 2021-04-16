package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.pages.AccountPage;
import com.qaprosoft.carina.demo.gui.pages.BasePage;
import com.qaprosoft.carina.demo.gui.pages.RegistrationPage;
import com.qaprosoft.carina.demo.gui.pages.LoginPage;
import org.apache.commons.lang.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends AbstractTest {

    private final String email = RandomStringUtils.randomAlphanumeric(6) + "@gmail.com";
    private final String firstname = RandomStringUtils.randomAlphabetic(6);
    private final String lastname = RandomStringUtils.randomAlphabetic(5);
    private final String password = RandomStringUtils.randomAlphanumeric(5);
    private final String address = RandomStringUtils.randomAlphabetic(6);
    private final String city = RandomStringUtils.randomAlphabetic(6);
    private final String postcode = RandomStringUtils.randomNumeric(5);
    private final String phone = RandomStringUtils.randomNumeric(7);
    private final String addressAlias = RandomStringUtils.randomAlphabetic(6);


    @Test
    @MethodOwner(owner = "tminchuk")
    public void validateRegistrationAccount(){
        BasePage basePage = new BasePage(getDriver());
        basePage.open();
        Assert.assertTrue(basePage.isPageOpened(), "Home page is not opened");

        LoginPage loginPage = basePage.getHeader().openLoginPage();

        RegistrationPage registrationPage = loginPage.getRegistrationItem().registerNewEmailValid(email);
        Assert.assertTrue(registrationPage.isPageOpened(), "Registration page is not opened");


        registrationPage.typeFirstname(firstname);
        registrationPage.typeLastname(lastname);
        registrationPage.typePassword(password);
        registrationPage.typeAddress(address);
        registrationPage.typeCity(city);
        registrationPage.selectCountry(R.TESTDATA.get("test_country"));
        registrationPage.selectState(R.TESTDATA.get("test_state"));
        registrationPage.typePostcode(postcode);
        registrationPage.typePhone(phone);
        registrationPage.typeAddressAlias(addressAlias);

        AccountPage accountPage = registrationPage.clickRegisterButton();
        Assert.assertEquals(accountPage.findInfoMessage().getText(), "Welcome to your account. Here you can manage all of your personal information and orders.");

    }





}

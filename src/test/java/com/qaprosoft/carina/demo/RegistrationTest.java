package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.pages.AccountCreationPage;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import com.qaprosoft.carina.demo.gui.pages.LoginPage;
import com.qaprosoft.carina.demo.gui.pages.MyAccountPage;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;
import org.testng.Assert;

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
    public void verifyRegistrationAccount(){
        HomePage homePageShop = new HomePage(getDriver());
        homePageShop.open();
        Assert.assertTrue(homePageShop.isPageOpened(), "Home page is not opened");

        LoginPage loginPageShop = homePageShop.getHeaderMenu().openLoginPage();

        AccountCreationPage accountCreationPageShop = loginPageShop.getAuthentication().registerNewEmailValid(email);
        Assert.assertTrue(accountCreationPageShop.isPageOpened(), "Account creation page is not opened");


        MyAccountPage myAccountPageShop = accountCreationPageShop.registerAccount(firstname, lastname, password, address, city, postcode, phone, addressAlias);
        Assert.assertTrue(myAccountPageShop.isPageOpened(), "My account page is not opened");
    }





}

package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.pages.AccountCreationPage;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import com.qaprosoft.carina.demo.gui.pages.LoginPage;
import com.qaprosoft.carina.demo.gui.pages.MyAccountPage;
import org.junit.Test;
import org.testng.Assert;

public class WebSampleTest extends AbstractTest {

    @Test
    @MethodOwner(owner = "tminchuk")
    public void verifyRegistrationAccount(){
        HomePage homePageShop = new HomePage(getDriver());
        homePageShop.open();
        Assert.assertTrue(homePageShop.isPageOpened(), "Home page is not opened");

        LoginPage loginPageShop = homePageShop.getHeaderMenu().openLoginPage();

        final String email = "newqa116@gmail.com";
        AccountCreationPage accountCreationPageShop = loginPageShop.getAuthentication().registerNewEmailValid(email);
        Assert.assertTrue(accountCreationPageShop.isPageOpened(), "Account creation page is not opened");

        final String firstname = "Rachel";
        final String lastname = "Green";
        final String password = "qwerty123";
        final String address = "str. Pobediteley, Minsk";
        final String city = "Minsk";
        final String postcode = "00000";
        final String phone = "+375440000000";
        final String addressAlias = "My address";

        MyAccountPage myAccountPageShop = accountCreationPageShop.registerAccount(firstname, lastname, password, address, city, postcode, phone, addressAlias);
        Assert.assertTrue(myAccountPageShop.isPageOpened(), "My account page is not opened");
    }

    



}

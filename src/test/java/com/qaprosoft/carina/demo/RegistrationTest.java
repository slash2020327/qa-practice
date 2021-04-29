package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.common.AccountPageBase;
import com.qaprosoft.carina.demo.gui.common.LoginPageBase;
import com.qaprosoft.carina.demo.gui.common.RegistrationPageBase;

import org.apache.commons.lang.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class RegistrationTest extends BaseTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test
    @MethodOwner(owner = "tminchuk")
    public void testRegistrationAccount() {
        String email = RandomStringUtils.randomAlphanumeric(6) + "@gmail.com";
        String firstname = RandomStringUtils.randomAlphabetic(6);
        String lastname = RandomStringUtils.randomAlphabetic(5);
        String password = RandomStringUtils.randomAlphanumeric(5);
        String address = RandomStringUtils.randomAlphabetic(6);
        String city = RandomStringUtils.randomAlphabetic(6);
        String postcode = RandomStringUtils.randomNumeric(5);
        String phone = RandomStringUtils.randomNumeric(7);
        String addressAlias = RandomStringUtils.randomAlphabetic(6);

        LoginPageBase loginPage = homePage.getHeader().openLoginPage();

        RegistrationPageBase registrationPage = loginPage.getRegistrationItem().registerNewEmailValid(email);
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

        AccountPageBase accountPage = registrationPage.clickRegisterButton();
        Assert.assertEquals(accountPage.findInfoMessage().getText(), R.TESTDATA.get("test_success_login_message"));
        
        LOGGER.info("Registration successful!");
    }
}

package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.utils.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.pages.AccountPage;
import com.qaprosoft.carina.demo.gui.pages.BasePage;
import com.qaprosoft.carina.demo.gui.pages.LoginPage;

import java.lang.invoke.MethodHandles;

public class LoginTest extends AbstractTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test
    @MethodOwner(owner = "Tsekhanovich")
    public void testLogin() {
        BasePage basePage = new BasePage(getDriver());
        basePage.open();
        Assert.assertTrue(basePage.isPageOpened(), "Base page is not opened!");

        LoginPage loginPage = basePage.getHeader().openLoginPage();
        Assert.assertTrue(loginPage.isPageOpened(), "Login page is not opened!");

        loginPage.getLoginItem().typeEmail(R.TESTDATA.get("test_login_value"));
        loginPage.getLoginItem().typePassword(R.TESTDATA.get("test_password_value"));

        AccountPage accountPage = loginPage.getLoginItem().confirmLogin();
        Assert.assertTrue(accountPage.isPageOpened(), "Account page is not opened!");
        Assert.assertEquals(accountPage.findInfoMessage().getText(), R.TESTDATA.get("test_success_login_message"));
        LOGGER.info("Login successful!");
    }
}

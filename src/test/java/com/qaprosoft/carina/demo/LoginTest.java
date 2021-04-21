package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.utils.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.pages.AccountPage;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import com.qaprosoft.carina.demo.gui.pages.LoginPage;

import java.lang.invoke.MethodHandles;

public class LoginTest extends BaseTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test
    @MethodOwner(owner = "Tsekhanovich")
    public void testLogin() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Base page is not opened!");

        LoginPage loginPage = homePage.getHeader().openLoginPage();
        Assert.assertTrue(loginPage.isPageOpened(), "Login page is not opened!");
        
        AccountPage accountPage = login(loginPage).getLoginItem().confirmAccountLogin();// loginPage.getLoginItem().confirmAccountLogin();
        Assert.assertTrue(accountPage.isPageOpened(), "Account page is not opened!");
        
        Assert.assertEquals(accountPage.findInfoMessage().getText(), R.TESTDATA.get("test_success_login_message"));
        LOGGER.info("Login successful!");
    }
}

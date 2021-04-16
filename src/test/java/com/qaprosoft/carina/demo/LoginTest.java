package com.qaprosoft.carina.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.pages.AccountPage;
import com.qaprosoft.carina.demo.gui.pages.BasePage;
import com.qaprosoft.carina.demo.gui.pages.LoginPage;

public class LoginTest extends AbstractTest {
	@Test
	@MethodOwner(owner = "Tsekhanovich")
	public void validateLogin() {
		BasePage basePage = new BasePage(getDriver());
		basePage.open();
		Assert.assertTrue(basePage.isPageOpened(), "Base page is not opened!");
		
		LoginPage loginPage = basePage.getHeader().openLoginPage();
		Assert.assertTrue(loginPage.isPageOpened(), "Login page is not opened!");
		
		loginPage.getLoginItem().typeEmail(R.TESTDATA.get("test_login_value"));
		loginPage.getLoginItem().typePassword(R.TESTDATA.get("test_password_value"));
		
		AccountPage accountPage = loginPage.getLoginItem().confirmLogin();
		Assert.assertTrue(accountPage.isPageOpened(), "Account page is not opened!");
		Assert.assertEquals(accountPage.findInfoMessage().getText(), "Welcome to your account. Here you can manage "
				+ "all of your personal information and orders.");
		
		
		
		System.out.println("Login successful!");
		
	}
}

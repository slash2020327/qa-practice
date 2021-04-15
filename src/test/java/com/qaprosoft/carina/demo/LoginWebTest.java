package com.qaprosoft.carina.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.pages.AccountPage;
import com.qaprosoft.carina.demo.gui.pages.BasePage;
import com.qaprosoft.carina.demo.gui.pages.LoginPage;

public class LoginWebTest extends AbstractTest {
	@Test
	@MethodOwner(owner = "Tsekhanovich")
	public void testLogin() {
		BasePage basePage = new BasePage(getDriver());
		basePage.open();
		Assert.assertTrue(basePage.isPageOpened(), "Base page is not opened!");
		
		LoginPage loginPage = basePage.getHeader().openLoginPage();
		Assert.assertTrue(loginPage.isPageOpened(), "Login page is not opened!");
		
		loginPage.getLoginItem().setEmail("newqa111@gmail.com");
		loginPage.getLoginItem().setPassword("qwerty123");
		
		AccountPage accountPage = loginPage.getLoginItem().confirmLogin();
		Assert.assertTrue(accountPage.isPageOpened(), "Account page is not opened!");
	}
}

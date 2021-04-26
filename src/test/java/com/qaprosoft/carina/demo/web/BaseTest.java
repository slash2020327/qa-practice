package com.qaprosoft.carina.demo.web;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.gui.web.pages.HomePage;
import com.qaprosoft.carina.demo.gui.web.pages.LoginPage;


public class BaseTest extends AbstractTest {
	protected HomePage homePage = new HomePage(getDriver());
	
	@BeforeMethod
	public void openMainPage() {
		
		homePage.open();
		Assert.assertTrue(homePage.isPageOpened(), "Base page is not opened!");
	}
	
	public LoginPage webLogin(String login, String password) {
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.getLoginItem().typeEmail(login);
        loginPage.getLoginItem().typePassword(password);
        return loginPage;
	}
	

}

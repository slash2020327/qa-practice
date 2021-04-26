package com.qaprosoft.carina.demo.android;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.gui.android.pages.HomePage;
import com.qaprosoft.carina.demo.gui.android.pages.LoginPage;


public class BaseTest extends AbstractTest {
	protected HomePage homePage = new HomePage(getDriver());
	
	@BeforeMethod
	public void openMainPage() {
		homePage.open();
		Assert.assertTrue(homePage.isPageOpened(), "Base page is not opened!");
	}
	
	public LoginPage login(String login, String password) {
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.getLoginItem().typeEmail(login);
        loginPage.getLoginItem().typePassword(password);
        return loginPage;
	}
	

}

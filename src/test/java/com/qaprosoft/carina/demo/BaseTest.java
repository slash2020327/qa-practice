package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.demo.gui.pages.LoginPage;

public class BaseTest extends AbstractTest {
	public LoginPage login(LoginPage loginPage) {
		loginPage.getLoginItem().typeEmail(R.TESTDATA.get("test_login_value"));
        loginPage.getLoginItem().typePassword(R.TESTDATA.get("test_password_value"));
        return loginPage;
	}

}

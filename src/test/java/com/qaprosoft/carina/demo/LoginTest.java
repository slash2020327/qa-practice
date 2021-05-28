package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.utils.R;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.common.AccountPageBase;

import java.lang.invoke.MethodHandles;

public class LoginTest extends BaseTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    
//    private static CryptoTool cryptoTool = new CryptoTool(Configuration.get(Configuration.Parameter.CRYPTO_KEY_PATH));
//    private static Pattern CRYPTO_PATTERN = Pattern.compile(SpecialKeywords.CRYPT);

    @Test
    @MethodOwner(owner = "Tsekhanovich")
    public void testLogin() {
        homePage.getHeader().openLoginPage();
        AccountPageBase accountPage = webLogin((R.TESTDATA.get("test_login_value")), 
        		R.TESTDATA.get("test_password_value")).getLoginItem().confirmAccountLogin();
        Assert.assertEquals(accountPage.findInfoMessage().getText(), R.TESTDATA.get("test_success_login_message"));
        LOGGER.info("Login successful!");
    }
}

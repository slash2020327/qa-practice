package com.qaprosoft.carina.demo.gui.components.common;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.foundation.utils.factory.ICustomTypePageFactory;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.common.AccountPageBase;
import com.qaprosoft.carina.demo.gui.common.AddressPageBase;

public abstract class LoginItem extends AbstractUIObject implements IMobileUtils, ICustomTypePageFactory {
    public LoginItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract void typeEmail(String email);

    public abstract void typePassword(String password);

    public abstract AccountPageBase confirmAccountLogin();
    
    public abstract AddressPageBase confirmOrderLogin();
}

package com.qaprosoft.carina.demo.gui.components.common;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.foundation.utils.factory.ICustomTypePageFactory;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.common.LoginPageBase;
import com.qaprosoft.carina.demo.gui.common.SearchResultsPageBase;


public abstract class HeaderItem extends AbstractUIObject implements ICustomTypePageFactory {
    public HeaderItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract LoginPageBase openLoginPage();
    
    public abstract SearchResultsPageBase searchProduct(String item);
}

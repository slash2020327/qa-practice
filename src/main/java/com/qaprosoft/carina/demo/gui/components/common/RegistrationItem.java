package com.qaprosoft.carina.demo.gui.components.common;

import com.qaprosoft.carina.core.foundation.utils.factory.ICustomTypePageFactory;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.common.RegistrationPageBase;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class RegistrationItem extends AbstractUIObject implements ICustomTypePageFactory {
    public RegistrationItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract RegistrationPageBase registerNewEmailValid(String email);
}

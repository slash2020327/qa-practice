package com.qaprosoft.carina.demo.gui.components.common;

import com.qaprosoft.carina.core.foundation.utils.factory.ICustomTypePageFactory;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.common.ProductPageBase;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;


public abstract class ProductItem extends AbstractUIObject implements ICustomTypePageFactory {
    public ProductItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract String getTitle();

    public abstract ProductPageBase openProductPage();
}

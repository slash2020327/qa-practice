package com.qaprosoft.carina.demo.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductItem extends AbstractUIObject {

    @FindBy(xpath = "//div[@class='product-container']")
    private ExtendedWebElement productItem;

    public ProductItem(WebDriver driver, SearchContext searchContext){
        super(driver, searchContext);
    }

    public String readTitle(){
        return productItem.getElement().getText();

    }

}

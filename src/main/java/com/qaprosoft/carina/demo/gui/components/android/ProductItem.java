package com.qaprosoft.carina.demo.gui.components.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.BaseItem;
import com.qaprosoft.carina.demo.gui.common.ProductPageBase;
import com.qaprosoft.carina.demo.gui.pages.android.ProductPage;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class ProductItem extends BaseItem {

    @FindBy(xpath = "//div[@class='product-container']")
    private ExtendedWebElement productItem;

    @FindBy(xpath = "//span[contains(text(),'More')]")
    private ExtendedWebElement productLink;

    public ProductItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public String getTitle() {
        return productItem.getElement().getText();
    }

    public ProductPageBase openProductPage() {
        productLink.click();
        return initPage(getDriver(), ProductPageBase.class);
    }
}

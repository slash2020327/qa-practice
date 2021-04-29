package com.qaprosoft.carina.demo.gui.components.desktop;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.common.ProductPageBase;
import com.qaprosoft.carina.demo.gui.components.common.ProductItem;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class DesktopProductItem extends ProductItem {

    @FindBy(xpath = "//div[@class='product-container']")
    private ExtendedWebElement productItem;

    @FindBy(xpath = ".//a[@class='product-name']")
    private ExtendedWebElement productLink;

    public DesktopProductItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public String getTitle() {
        return productItem.getElement().getText();
    }

    @Override
    public ProductPageBase openProductPage() {
        productLink.click();
        return initPage(getDriver(), ProductPageBase.class);
    }
}

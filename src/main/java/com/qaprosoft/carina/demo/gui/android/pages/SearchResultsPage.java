package com.qaprosoft.carina.demo.gui.android.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.gui.android.components.ProductItem;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomeBasePage.class)
public class SearchResultsPage extends HomeBasePage {

    @FindBy(xpath = "//div[@class='product-container']")
    private List<ProductItem> productItem;


    public SearchResultsPage(WebDriver driver){
        super(driver);
        setPageURL("?controller=search&$ignore");
    }

    public List<ProductItem> getProductList(){
      return productItem;
    }

}

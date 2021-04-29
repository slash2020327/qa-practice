package com.qaprosoft.carina.demo.gui.pages.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.gui.common.SearchResultsPageBase;
import com.qaprosoft.carina.demo.gui.components.android.AndroidProductItem;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = SearchResultsPageBase.class)
public class SearchResultsPage extends SearchResultsPageBase {

    @FindBy(xpath = "//div[@class='product-container']")
    private List<AndroidProductItem> productItem;


    public SearchResultsPage(WebDriver driver){
        super(driver);
        setPageURL("?controller=search&$ignore");
    }

    @Override
    public List<AndroidProductItem> getProductList(){
      return productItem;
    }

}

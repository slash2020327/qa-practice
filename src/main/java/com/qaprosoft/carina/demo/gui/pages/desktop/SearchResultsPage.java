package com.qaprosoft.carina.demo.gui.pages.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.demo.gui.BaseItem;
import com.qaprosoft.carina.demo.gui.common.SearchResultsPageBase;

import java.util.List;

public class SearchResultsPage extends SearchResultsPageBase {

    @FindBy(xpath = "//div[@class='product-container']")
    private List<BaseItem> productItem;


    public SearchResultsPage(WebDriver driver){
        super(driver);
        setPageURL("?controller=search&$ignore");
    }

    public List<BaseItem> getProductList(){
      return productItem;
    }

}

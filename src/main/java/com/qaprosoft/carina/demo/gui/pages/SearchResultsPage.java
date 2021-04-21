package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.demo.gui.components.ProductItem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage{

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

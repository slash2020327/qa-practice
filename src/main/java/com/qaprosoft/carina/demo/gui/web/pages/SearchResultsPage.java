package com.qaprosoft.carina.demo.gui.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.demo.gui.BasePage;
import com.qaprosoft.carina.demo.gui.web.components.ProductItem;

import java.util.List;

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

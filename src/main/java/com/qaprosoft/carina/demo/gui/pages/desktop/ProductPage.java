package com.qaprosoft.carina.demo.gui.pages.desktop;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.common.OrderPageBase;
import com.qaprosoft.carina.demo.gui.common.ProductPageBase;

public class ProductPage extends ProductPageBase {
	@FindBy(xpath="//ul[@id='color_to_pick_list']//li")
	private List<ExtendedWebElement> colors;

	@FindBy(xpath="//select[contains(@class,'attribute_select')]")
	private ExtendedWebElement sizeMenu;
	
	@FindBy(xpath="//select[contains(@class, 'attribute_select')]/option")
	private List<ExtendedWebElement> sizes;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private ExtendedWebElement button;
	
	@FindBy(xpath="//i[@class='icon-ok']")
	private ExtendedWebElement okIcon;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private ExtendedWebElement proceedButton;
	
	public ProductPage(WebDriver driver) {
		super(driver);
		setPageURL("?id_product=&$ignore&controller=product");
	}
	
	public ProductPageBase selectRandomColor() {
		int rand = (int)(Math.random() * colors.size());
		colors.get(rand).click();
		return initPage(getDriver(), ProductPageBase.class);
    }
	
	public ProductPageBase selectRandomSize() {
		int rand = (int)(Math.random() * sizes.size());
		sizeMenu.select(rand);
		return initPage(getDriver(), ProductPageBase.class);
    }
	
	public ProductPageBase addProduct() {
		button.click();
		return initPage(getDriver(), ProductPageBase.class);
    }
	
	public ExtendedWebElement getOkIcon() {
    	return okIcon;
    }
	
	public OrderPageBase clickProceedButton() {
		proceedButton.click();
		return initPage(getDriver(), OrderPageBase.class);
    }
}
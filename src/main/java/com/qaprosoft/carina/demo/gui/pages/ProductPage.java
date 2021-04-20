package com.qaprosoft.carina.demo.gui.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class ProductPage extends BasePage{
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
	
	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
	public ProductPage selectRandomColor() {
		int rand = (int)(Math.random() * colors.size());
		colors.get(rand).click();
		return new ProductPage(driver);
    }
	
	public ProductPage selectRandomSize() {
		int rand = (int)(Math.random() * sizes.size());
		sizeMenu.select(rand);
		return new ProductPage(driver);
    }
	
	public ProductPage addProduct() {
		button.click();
		return new ProductPage(driver);
    }
	
	public ExtendedWebElement getOkIcon() {
    	return okIcon;
    }
	
}

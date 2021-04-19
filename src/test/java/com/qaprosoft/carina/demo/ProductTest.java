package com.qaprosoft.carina.demo;

import java.lang.invoke.MethodHandles;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.components.ProductItem;
import com.qaprosoft.carina.demo.gui.pages.BasePage;
import com.qaprosoft.carina.demo.gui.pages.ProductPage;

public class ProductTest extends AbstractTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	@Test
    @MethodOwner(owner = "Tsekhanovich")
    public void testProduct() throws InterruptedException {
		BasePage basePage = new BasePage(getDriver());
		basePage.open();
		Assert.assertTrue(basePage.isPageOpened(), "Base page is not opened!");
		
		List<ProductItem> products = basePage.getProducts();
		
		int rand = (int)(Math.random() * basePage.getProducts().size());
		ProductPage productPage = products.get(rand).openProductPage();
		Assert.assertTrue(productPage.isPageOpened(), "Product page is not opened!");
		
		productPage.selectRandomColor();
		productPage.selectRandomSize();
		productPage.addProduct();
		Assert.assertTrue(productPage.getOkIcon().isVisible(), "Product has not been added");
		
		
        LOGGER.info("Product has been added!");
    }
}

package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.components.ProductItem;
import com.qaprosoft.carina.demo.gui.components.Timeouts;
import com.qaprosoft.carina.demo.gui.pages.BasePage;
import com.qaprosoft.carina.demo.gui.pages.SearchResultsPage;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.lang.invoke.MethodHandles;
import java.util.List;


public class SearchTest extends AbstractTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test
    @MethodOwner(owner = "tminchuk")
    public void testSearch(){
        String searchItem = R.TESTDATA.get("test_search_item");

        BasePage basePage = new BasePage(getDriver());
        basePage.open();
        Assert.assertTrue(basePage.isPageOpened(), "Home page is not opened");

        SearchResultsPage searchResultsPage = basePage.getHeader().searchProduct(searchItem);
        pause(Timeouts.SHORT_TIMEOUT.duration);
        List<ProductItem> productItem = searchResultsPage.getProductList();
        pause(Timeouts.SHORT_TIMEOUT.duration);
        Assert.assertFalse(CollectionUtils.isEmpty(productItem), "No items found!");

        for(ProductItem item : productItem) {
            Assert.assertTrue(StringUtils.containsIgnoreCase(item.getTitle(), searchItem),
                    "Found invalid item!");
        }
    }
}
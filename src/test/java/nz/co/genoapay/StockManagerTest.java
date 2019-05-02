package nz.co.genoapay;

import org.junit.Assert;
import org.junit.Test;

public class StockManagerTest {

    @Test
    public void testBasic() {
        int[] stockPrices = {10, 7, 5, 8, 11, 9};

        Assert.assertEquals(6, StockManager.getMaxProfit(stockPrices));
    }

    @Test
    public void testAllAscending() {
        int[] stockPrices = {1, 2, 3, 4, 5, 7};

        Assert.assertEquals(6, StockManager.getMaxProfit(stockPrices));
    }

    @Test
    public void testAllDescending() {
        int[] stockPrices = {6, 5, 4, 3, 2 ,0};

        Assert.assertEquals(0, StockManager.getMaxProfit(stockPrices));
    }

    @Test
    public void testOneValueInArray() {
        int[] stockPrices = {1};

        Assert.assertEquals(0, StockManager.getMaxProfit(stockPrices));
    }

    @Test
    public void testEmptyArray() {
        int[] stockPrices = {};

        Assert.assertEquals(0, StockManager.getMaxProfit(stockPrices));
    }
}
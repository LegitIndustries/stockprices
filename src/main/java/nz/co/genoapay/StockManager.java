package nz.co.genoapay;

public class StockManager {

    public static int getMaxProfit(int[] stockPrices) {

        int lowestPriceFound = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int stockPrice : stockPrices) {

            if (stockPrice < lowestPriceFound) {
                lowestPriceFound = stockPrice;
            }

            int difference = stockPrice - lowestPriceFound;
            if (maxProfit < difference) {
                maxProfit = difference;
            }
        }
        return maxProfit;
    }
}

package com.github.dmitrKuznetsov.array;

// https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/564/

public class BestTimeToBuyAndSellStock2 {

    private static int stock = -1;
    private static int profit = 0;
    public static int maxProfit(int[] prices) {

        for (int ii = 0; ii < prices.length-1; ii++) {
            sell(prices[ii]);
            if (prices[ii] < prices[ii + 1]) {
                buy(prices[ii]);
            }
        }

        if (stock < prices[prices.length-1]) {
            sell(prices[prices.length-1]);
        }

        int l_profit = profit;
        stock = -1;
        profit = 0;

        return l_profit;
    }
    private static void buy(int price) {
        stock = price;
    }
    private static void sell(int price) {
        if (stock >= 0) {
            profit += price - stock;
            stock = -1;
        }
    }
}

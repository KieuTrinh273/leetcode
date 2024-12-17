package com.example.exe_leetcode;

public class _122_best_time_to_buy_and_sell_stock_2 {
    public static void test() {
        int[] prices = {1, 2, 3, 4, 5};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i == prices.length - 1) {
                continue;
            }
            if (prices[i + 1] > prices[i]) {
                profit += (prices[i + 1] - prices[i]);
            }
        }
        return profit;
    }
}

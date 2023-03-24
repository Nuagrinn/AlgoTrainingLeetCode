package ru.keller.solutions;

public class BestTimetoBuyandSellStockII {

    public int maxProfit(int[] prices) {

        int profit = 0;

        for (int i = 0, j = i + 1; j < prices.length;) {

            int curStock = prices[i];
            int futherStock = prices[j];

            while (i < prices.length && j < prices.length - 1  && curStock >= futherStock){
                i++;
                curStock = prices[i];
                j++;
                futherStock = prices[j];

            }

            while(j < prices.length-1 && prices[j] < prices[j + 1]){
                futherStock = prices[j + 1];
                j++;
            }

            if(curStock < futherStock){
                profit += futherStock - curStock;
                i = j + 1;
                j = i + 1;
            }
            else {
                j++;
            }

        }
        return profit;
    }

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};

        BestTimetoBuyandSellStockII method = new BestTimetoBuyandSellStockII();
        int profit = method.maxProfit(prices);
        System.out.println(profit);

    }
}

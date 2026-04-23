package dsa;

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            }else{
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = obj.maxProfit(prices);
        System.out.println("Max Profit: " + result);
    }
}
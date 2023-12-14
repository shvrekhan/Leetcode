class Solution {

    public int maxProfit(int[] prices) {
        
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        
        int currentMax = prices[prices.length - 1];
        int maxProfit = Integer.MIN_VALUE;

        for (int index = prices.length - 2; index >= 0; index--) {
            
            if (currentMax - prices[index] > maxProfit) {
                maxProfit = currentMax - prices[index];
            }
            if (prices[index] > currentMax) {
                currentMax = prices[index];
            }
        }

        return maxProfit > 0 ? maxProfit : 0;
    }
}

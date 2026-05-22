class Solution { //Think about loop termination 
    public int maxProfit(int[] prices) {
        int profit = 0;
        int left = 0;
        int right = 1;

        while(!(right > prices.length - 1)){
            if(prices[right] < prices[left]){
                left = right;
                right = left + 1;
            }
            else if(prices[left] <= prices[right]){
                profit = Math.max(profit,profit = prices[right] - prices[left]);
                ++right;
            }
        }
        return profit;
    }
}

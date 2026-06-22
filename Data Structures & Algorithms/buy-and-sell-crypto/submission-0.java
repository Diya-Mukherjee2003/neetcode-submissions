class Solution {
    public int maxProfit(int[] prices) {
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            mini=Math.min(prices[i],mini);
            int profit=prices[i]-mini;
            maxi=Math.max(maxi,profit);
        }
        return maxi;
    }
}

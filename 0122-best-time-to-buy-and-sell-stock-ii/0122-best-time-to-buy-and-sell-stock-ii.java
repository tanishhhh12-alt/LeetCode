class Solution {
    public int maxProfit(int[] prices) {
        int dp[][]  = new int[prices.length+ 1][2];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
       return solve(prices,0,0,dp); 
    }
    public int solve(int[] prices,int i,int buy,int[][] dp){
        if(i>= prices.length){
            return 0;
        }
        if(dp[i][buy] != -1){
            return dp[i][buy];
        }
        int getstock =0;
        int notgetstock =0;
        int sellstock =0;
        int notsellstock =0;
        

        if(buy ==0){
           getstock = solve(prices,i+1,1,dp) -prices[i];
           notgetstock = solve(prices,i+1,0,dp);
        }else{
            sellstock = solve(prices,i+1,0,dp) + prices[i];
            notsellstock = solve(prices,i+1,1,dp);
        }
        int  Buy = Math.max(getstock,notgetstock);
        int sell = Math.max(sellstock,notsellstock);
        return dp[i][buy] =Math.max(Buy,sell);
}
}
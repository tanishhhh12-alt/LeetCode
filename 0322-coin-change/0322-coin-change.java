class Solution {
    public int coinChange(int[] coins, int amount) {
     int dp[] = new int[amount+1];

     Arrays.fill(dp,-2);

     dp[0]=0;
     return solve(coins,amount,dp); 
    }

    static int solve(int[] coins,int amount,int[] dp){


        if(amount==0){
        return 0;
     }

     if(dp[amount] != -2){
        return dp[amount];
     }
     int ans = Integer.MAX_VALUE;

     for(int i =0;i<coins.length;i++){
        if(amount - coins[i]>=0){
            int sans = solve(coins,amount-coins[i],dp);
            
            if(sans != -1&& sans+1<ans ){
                ans  = sans +1;
            }

        }
     }

    if(ans == Integer.MAX_VALUE){
        return dp[amount] = -1;
    }

    return dp[amount] =ans;
    }

}
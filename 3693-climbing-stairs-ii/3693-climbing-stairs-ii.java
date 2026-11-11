class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] =0;
        return solve(n,costs,dp);
    }

    public int solve(int i,int[] costs,int[] dp){
        if(i == 0){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }
        int ans = Integer.MAX_VALUE;

        if(i-1>=0){
            ans = Math.min(ans,solve(i-1,costs,dp) + costs[i-1] +1);
        }



        if(i-2>=0){
            ans = Math.min(ans,solve(i-2,costs,dp) + costs[i-1] +4);
        }

        if(i-3>=0){
            ans = Math.min(ans,solve(i-3,costs,dp) + costs[i-1] +9);
        }
        return dp[i]=ans;
    }
}
class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        
        int[] dp1 = new int[n+1];
        int[] dp2 = new int[n+1];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
       
        if(n==1){
            return nums[0];
        }
       
         return Math.max(solve(nums,0,n-1,dp1),solve(nums,1,n,dp2));
    }

    public int solve(int[] nums,int i,int n,int[] dp){
        if(i>=n){
          return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }

        int skip = solve(nums,i+1,n,dp);
        int take = nums[i] + solve(nums,i+2,n,dp);

          return dp[i] = Math.max(skip,take);
    }
}
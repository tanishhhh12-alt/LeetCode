class Solution {
    public long maxAlternatingSum(int[] nums) {
        int even = 0;
        long dp [][] = new long[nums.length+1][2];
        for(long[] row : dp){
             Arrays.fill(row,-1);
             }
        
        return solve(nums,0,even,dp);
    }

    public long solve(int[] nums,int i,int even,long[][] dp){
        if(i>=nums.length){
            return 0;
        }

        if(dp[i][even] != -1){
            return dp[i][even];
        }
        long et =0;
        if(even == 0){
            et = solve(nums,i+1,1,dp) + nums[i];
        }else{
            et = solve(nums,i+1,0,dp) - nums[i];
        }

        long nt = solve(nums,i+1,even,dp);

        return dp[i][even] =  Math.max(et,nt);
    


    }
}
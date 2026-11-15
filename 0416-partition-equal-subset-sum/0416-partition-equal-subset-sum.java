class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
        }
        Boolean dp[][] = new Boolean[nums.length+1][sum+1];
       return solve(nums,0,sum,0,dp);
    }
    boolean solve(int[] nums,int ls,int rs,int i,Boolean[][] dp){
        if(ls == rs){
            return true;
        }
        if(i>=nums.length){
            return false;
        }
        if(ls>rs){
            return false;
        }
        if(dp[i][ls] != null){
            return dp[i][ls];
        }

        boolean shift = solve(nums,ls+nums[i],rs-nums[i],i+1,dp);
        boolean notshift = solve(nums,ls,rs,i+1,dp);

        return dp[i][ls] = shift || notshift;

        
    }
}

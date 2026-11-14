class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int [nums.length+1][nums.length+1];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
       
        int pi  = -1;
        return solve(nums,0,pi,dp);
    }
    public int solve(int[] nums,int i,int pi,int[][] dp){
        if(i>= nums.length){
            return 0;
        }

        if(dp[i][pi+1] != -1){
            return dp[i][pi+1];
        }
        int take =0;
        int skip = 0;

        if(  pi == -1 || nums[i] > nums[pi] ){
            take = 1+ solve(nums,i+1,i,dp);
            skip = solve(nums,i+1,pi,dp);
        }else{
            skip = solve(nums,i+1,pi,dp);
        }
        return dp [i][pi+1] = Math.max(take,skip);
    }
}
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total =0;
        for(int x: nums){
            total+=x;
        }
        Integer[][] dp = new Integer[nums.length+1][2*total+1];
        return solve(nums,0,0,target,total,dp);
    }

    public int solve(int[] nums ,int i, int sum,int target,int total, Integer[][] dp ){
        if(i == nums.length){
            if(sum == target){

            return 1;
        }else{
            return 0;
        }
    }


    if(dp[i][sum+total] != null){
        return dp[i][sum+total];
    }
    

        int add = solve(nums,i+1,sum+nums[i],target,total,dp);
        int subtract= solve(nums,i+1,sum-nums[i],target,total,dp);

        return dp[i][sum+total] = add + subtract;
        }
}
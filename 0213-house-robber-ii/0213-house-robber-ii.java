class Solution {
    public int rob(int[] nums) {
        
       int[] dp = new int[nums.length+1];
       Arrays.fill(dp,-1);
       dp[0] =0;
       dp[1] = nums[0];
       if(nums.length == 1){
        return nums[0];
       }

       int[] dp1 = new int[nums.length+1];
       Arrays.fill(dp1,-1);
       dp1[0] =0;
       dp1[1] = nums[1];
       

       for(int  i =2;i<=nums.length-1;i++){
            dp[i] = Math.max(nums[i-1]+ dp[i-2],dp[i-1] );
       }

       
       for(int  i =2;i<=nums.length-1;i++){
            dp1[i] = Math.max(nums[i]+ dp1[i-2],dp1[i-1] );
       }
       return Math.max(dp[nums.length-1],dp1[nums.length-1]);
    }
}
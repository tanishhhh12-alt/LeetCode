class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc =1;
        int dec =1;
        int ans =0;

        int e =0;
        if(nums.length ==1){
            return 1;
        }


        while(e<nums.length-1){
            if(nums[e+1]>nums[e]){
                inc++;
                dec =1;
            }else if(nums[e+1]< nums[e]){
                inc=1;
                dec++;
            }else{
                inc =1;
                dec=1;
            }

            ans = Math.max(ans,Math.max(inc,dec));

            e++;
        }
        return ans;
    }
}
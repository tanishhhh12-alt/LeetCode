class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] flags = new boolean[n+1];

        for(int i =0;i<n;i++){
            if(nums[i] >0 && nums[i]<=n){
                flags[nums[i]] = true;
            }
        }

        for(int i=0;i<n;i++){
            if(!flags[i+1]){
                return i+1;
            }
        }
        return n+1;
    }
}
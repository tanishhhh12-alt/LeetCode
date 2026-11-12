class Solution {
    public int rob(int[] nums) {
        
       
       int prep1 =0;
       int prev1 = nums[0];
       int temp =0;
       if(nums.length == 1){
        return nums[0];
       }

       if(nums.length == 2){
        return Math.max(nums[0],nums[1]);
       }

        int prep2 =0;
       int prev2 = nums[1];
       int temp2 =0;
       

       for(int  i =2;i<=nums.length-1;i++){
            temp = Math.max(nums[i-1]+ prep1,prev1 );
            prep1 = prev1;
            prev1 = temp;

       }

       
       for(int  i =2;i<=nums.length-1;i++){
           temp2 = Math.max(nums[i]+ prep2,prev2 );
           prep2 = prev2;
           prev2 = temp2;

       }
       return Math.max(temp,temp2);
    }
}
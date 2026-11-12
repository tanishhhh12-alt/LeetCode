class Solution {
    public int rob(int[] nums) {
       int prep =0;
       int prev = nums[0];
       int temp =0;

        if(nums.length == 1){
            return nums[0];
        }

        
    

        for(int i =2;i<=nums.length;i++){
              
             temp = Math.max(nums[i-1] + prep,prev);

             prep = prev;
             prev =temp;
         
        }

        return temp;
       
    
        
    }
}
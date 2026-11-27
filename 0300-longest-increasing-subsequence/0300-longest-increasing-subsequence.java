class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i =0;i<n;i++){
            if(ans.isEmpty() ||  ans.get(ans.size()-1)<nums[i]){
                ans.add(nums[i]);
            }else{
                int idx = bs(ans,nums[i]);
                ans.set(idx,nums[i]);
            }
        }
        return ans.size();
    }

    public int bs(ArrayList<Integer> ans,int target){
       for(int i =0;i<ans.size();i++){
        if(ans.get(i)>=target){
            return i;
        }
       }
       return ans.size();

    }
}
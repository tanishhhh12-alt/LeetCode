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
       int left =0;
       int right = ans.size()-1;
       
        while(left<=right){
                int mid = (left + right)/2;
                if(ans.get(mid) == target){
                    return mid;
                }else if(ans.get(mid)>target){
                    right = mid-1;
                }else{
                    left = mid+1;
       }
       }
       return left;

    }
}
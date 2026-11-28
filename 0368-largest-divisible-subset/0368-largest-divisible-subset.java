class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        int[] dp  = new int[nums.length +1];

       Arrays.fill(dp,-1);
        solve(nums,ans,0,-1,temp,dp);
        return ans;
    }

    public void solve(int[] nums,ArrayList<Integer> ans,int i,int pi,ArrayList<Integer> temp, int[] dp){
       if(i>=nums.length){
        if(temp.size()>ans.size()){
            ans.clear();
            ans.addAll(temp);
        }
        return;
       }

       

       if(temp.size()>dp[i] && (pi == -1  ||  nums[i] % pi == 0) ){
         dp[i] = temp.size();
         temp.add(nums[i]);
         solve(nums,ans,i+1,nums[i],temp,dp);
         temp.remove(temp.size()-1);
         
       }

      solve(nums,ans,i+1,pi,temp,dp);
    }
}
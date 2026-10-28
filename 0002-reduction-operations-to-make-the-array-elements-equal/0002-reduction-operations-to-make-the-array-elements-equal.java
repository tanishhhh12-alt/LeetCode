class Solution {
    public int reductionOperations(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int curr = nums[i];
            mp.put(curr,mp.getOrDefault(curr,0)+1);
        }
        if(mp.size() == 1){
            return 0;
        }

        if(mp.size() == nums.length){
            return nums.length;
        }
        return mp.size() +1;
    }
}
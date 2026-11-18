class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int s =0;
        int e =0;
        HashSet<Integer> mp = new HashSet<>();
        while(e<nums.length){
            if(mp.contains(nums[e])){
                return true;
            }


            int curr = nums[e];
            mp.add(curr);

            if(mp.size()>k){
                mp.remove(nums[e-k]);
            }

        e++;

        }

        return false;
    }
}
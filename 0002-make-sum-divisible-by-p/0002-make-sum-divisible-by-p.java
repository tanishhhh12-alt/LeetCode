class Solution {
    public int minSubarray(int[] nums, int p) {
        long total =0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }

        int target = (int)(total % p);
        if(target ==0){
            return 0;
        }

        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);

        int prefix =0;
        int ans = nums.length;

        for(int i =0;i<nums.length;i++){
            prefix=(prefix + nums[i]) %p;

            int need = (prefix - target + p) %p;

            if(mp.containsKey(need)){
                ans = Math.min(ans,i-mp.get(need));
            }

            mp.put(prefix,i);

        }
        if(ans == nums.length){
            return -1;
        }else{
            return ans;
        }
    }
}
class Solution {
    public long maxBalancedSubsequenceSum(int[] nums) {
        int n = nums.length;
        TreeMap<Integer,Long> mp = new TreeMap<>();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = nums[i] -i;
        }

        long res = Integer.MIN_VALUE;

        for(int i =0;i<n;i++){
            if(nums[i] <= 0){
                res= Math.max(res,nums[i]);
            }else{
                long temp = nums[i];
                if(mp.floorKey(arr[i]) != null){
                    temp+= mp.get(mp.floorKey(arr[i]));
                }
                while(mp.ceilingKey(arr[i]) != null && mp.get(mp.ceilingKey(arr[i]))<temp){
                    mp.remove(mp.ceilingKey(arr[i]));
                }

                if(mp.floorKey(arr[i]) == null  || mp.get(mp.floorKey(arr[i]))<temp){
                    mp.put(arr[i],temp);
                }
                 res = Math.max(res,temp);
            }
           
            
        }
        return res;
    }
}
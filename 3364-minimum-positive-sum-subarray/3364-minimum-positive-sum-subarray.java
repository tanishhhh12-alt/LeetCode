class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
       int n = nums.size();
       int s =0;
       int e =0;
       int min= Integer.MAX_VALUE;
       int sum =0;

       while(e<n){
            sum+= nums.get(e);

            if(e-s+1>r){
                sum-=nums.get(s);
                s++;
            }
            int temp =sum;
            int tempint = s;

            while(e-tempint+1>=l){
                if(temp>0){
                    min = Math.min(min,temp);
                }
                temp -= nums.get(tempint);
                tempint++;
            }

            e++;
       }
       if(min == Integer.MAX_VALUE){
        return -1;
       }
       return min;
    }
}

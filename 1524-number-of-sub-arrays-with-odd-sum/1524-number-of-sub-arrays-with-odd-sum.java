class Solution {
    public int numOfSubarrays(int[] arr) {
        int even =1;
        int odd =0;

        final int mod = 1000000007;
        long ans =0;
        long sum =0;

        for(int i =0;i<arr.length;i++){
            sum =( sum+arr[i]) %2;
            if(sum ==1){
                ans = (ans+even) % mod;
                odd++;
            }else{
                ans =( ans + odd) % mod;
                even++;
            }

        }
        return (int) ans;
    }
}
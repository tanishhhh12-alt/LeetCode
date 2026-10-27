class Solution {
    public int waysToMakeFair(int[] nums) {
        int os = 0;
        int es = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                es += nums[i];
            } else {
                os += nums[i];
            }
        }

        int le = 0;
        int lo = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                es -= nums[i];
            } else {
                os -= nums[i];
            }

            if ( os+ le == lo + es) {
                ans++;
            }

            if (i % 2 == 0) {
                le += nums[i];
            } else {
                lo += nums[i];
            }
        }

        return ans;

    }
}
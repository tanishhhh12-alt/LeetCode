class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int i = 0, j = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        while (j < n) {
            sum += nums.get(j);

            
            while (j - i + 1 > r) {
                sum -= nums.get(i);
                i++;
            }

            
            int tempSum = sum;
            int tempI = i;
            while (j - tempI + 1 >= l) {
                if (tempSum > 0) {
                    min = Math.min(min, tempSum);
                }
                tempSum -= nums.get(tempI);
                tempI++;
            }
            j++;
        }

       if(min == Integer.MAX_VALUE) return -1;
        return min;
    }
}

class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans,0);
        Stack<Integer> st = new Stack<>();

        for(int i =0;i<nums.length;i++){
            while(!st.isEmpty() && nums[i]>nums[st.peek()]){
                int index = st.pop();
                ans[index] = i-index;
            }
            st.push(i);
        }
        return ans;
    }
}
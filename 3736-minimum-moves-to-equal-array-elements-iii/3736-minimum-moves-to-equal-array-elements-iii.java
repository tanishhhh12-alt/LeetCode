class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int max =0;
        for(int i =0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        int moves =0;

        for(int i =0;i<nums.length;i++){
            moves+=max-nums[i];
        }
        return moves;
    }
}
class Solution {
    public int minCostClimbingStairs(int[] cost) {

        
        int prep = cost[0];
        int prev = cost[1];
        int temp =0;
        
        for(int i =2;i<cost.length;i++){
           temp = cost[i] + Math.min(prev,prep);
           prep = prev;
           prev = temp;
        }
        return Math.min(prev,prep);

    }
}
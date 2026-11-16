class Solution {
    public int findLongestChain(int[][] pairs) {
        int[][] dp = new int[pairs.length+1][pairs.length+1];

        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
       Arrays.sort(pairs,(a,b)-> Integer.compare(a[0],b[0]));
       return lis(pairs,0,-1,dp);
    }
    public int lis(int[][] pairs,int i,int pi,int[][] dp){
        if(i>=pairs.length){
            return 0;
        }

        if(dp[i][pi+1] != -1){
            return dp[i][pi+1];
        }
        int take =0;
        int skip=0;
        if(pi == -1 || pairs[i][0] > pairs[pi][1]){
            take = 1+ lis(pairs,i+1,i,dp);
            skip = lis(pairs,i+1,pi,dp);
        }else{
            skip = lis(pairs,i+1,pi,dp);
        }
        return dp[i][pi+1] = Math.max(take,skip);


    }
}
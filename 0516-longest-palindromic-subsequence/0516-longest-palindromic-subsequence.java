class Solution {
    public int longestPalindromeSubseq(String s) {
          String rev = new StringBuilder(s).reverse().toString();
          int[][] dp = new int[s.length() +1][s.length()+1];
          for(int[] row : dp){
            Arrays.fill(row,-1);
          }
        return  solve(s,rev,0,0,dp);
    }

    public int solve(String s,String rev,int i,int j, int[][] dp){
        if(i==s.length() || j == rev.length()){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int take =0;
        int skip =0;

        if(s.charAt(i) == rev.charAt(j)){
            take = 1+ solve(s,rev,i+1,j+1,dp);
        }

        skip = Math.max(solve(s,rev,i+1,j,dp),solve(s,rev,i,j+1,dp));

        return dp[i][j] =  Math.max(skip,take);
    }
}
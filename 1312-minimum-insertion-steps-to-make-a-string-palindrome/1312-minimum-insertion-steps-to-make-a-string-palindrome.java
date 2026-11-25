class Solution {
    public int minInsertions(String s) {
        int[][] dp = new int[s.length() +1][s.length() +1];
        for(int[] row : dp){
            Arrays.fill(row,0);
        }
        String rev = new StringBuilder(s).reverse().toString();
        int n = s.length();
        return n - lcs(s,rev,dp);
    }

    public int lcs(String s,String rev, int[][] dp){
      for(int i =1;i<=s.length();i++){
        for(int j =1;j<=s.length();j++){
            if(s.charAt(i-1) == rev.charAt(j-1)){
                dp[i][j] = 1+ dp[i-1][j-1];
            }else{
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
      }
      return dp[s.length()][s.length()];
    }
}
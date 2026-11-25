class Solution {
    public int minInsertions(String s) {
        Integer[][] dp = new Integer[s.length() +1][s.length() +1];
        String rev = new StringBuilder(s).reverse().toString();
        int n = s.length();
        return n - lcs(s,rev,0,0,dp);
    }

    public int lcs(String s,String rev,int i,int j, Integer[][] dp){
        if(i == s.length() || j == rev.length()){
            return 0;
        }

        if(dp[i][j] != null){
            return dp[i][j];
        }

        int take =0,skip =0;

        if(s.charAt(i) == rev.charAt(j)){
            take = 1 + lcs(s,rev,i+1,j+1,dp);
        }else{
            skip = Math.max(lcs(s,rev,i+1,j,dp),lcs(s,rev,i,j+1,dp));
        }

        return dp[i][j] = Math.max(take,skip);
    }
}
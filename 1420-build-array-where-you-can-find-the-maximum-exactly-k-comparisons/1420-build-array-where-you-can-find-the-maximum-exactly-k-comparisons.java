class Solution {
    public int numOfArrays(int n, int m, int k) {
        int dp[][][] = new int[n+1][m+1][k+1];

        for(int i =0;i<dp.length;i++){
            for(int j =0;j<dp[i].length;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return solve(n,m,k,0,0,0,dp);
    }
    public int solve(int n,int m,int k,int i,int maxsofar,int sc,int[][][] dp){
        int ans =0;
        int mod = 1000000007;
        if(i==n){
            if(sc == k){
                return 1;
            }else{
                return 0;
            }
        }
        if(sc>k){
            return 0;
        }
        if(dp[i][maxsofar][sc] != -1){
            return dp[i][maxsofar][sc];
        }

        for(int j =1;j<=m;j++){
            if(j>maxsofar){
                ans=(ans + solve(n,m,k,i+1,j,sc+1,dp))%mod;
            }else{
                ans=(ans+solve(n,m,k,i+1,maxsofar,sc,dp))%mod;
            }
        }
        return dp[i][maxsofar][sc] = ans%mod;
    }
}
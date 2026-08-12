class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
       return climbStairsDP(n,dp);
    }

    int climbStairsDP(int n,int[]dp){
        if(n<=2)    return dp[n]=n;
        
        int take;
        if(dp[n]!=-1){
            return dp[n];
        }

        return dp[n]=climbStairsDP(n-1,dp)+climbStairsDP(n-2,dp);
    }
}
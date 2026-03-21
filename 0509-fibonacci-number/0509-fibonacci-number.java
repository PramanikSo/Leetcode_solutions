class Solution {
    public int fib(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return fibUsingDp(n,dp);
    }

    int fibUsingDp(int n,int[]dp){
        if(n<=1)    return n;
        if(dp[n]!=-1)   return dp[n];
        return fibUsingDp(n-1,dp)+fibUsingDp(n-2,dp);
    }
}
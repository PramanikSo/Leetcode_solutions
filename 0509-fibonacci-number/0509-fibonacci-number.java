class Solution {
    public int fib(int n) {
        int dp[]=new int[n+1];
        // Arrays.fill(dp,-1);
        // return fibUsingDp(n,dp);
        if(n<=1)    return n;
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    // int fibUsingDp(int n,int[]dp){
    //     if(n<=1)    return n;
    //     int first,second;
    //     if(dp[n-1]!=-1){
    //         first=dp[n-1];
    //     }else{
    //         first=fibUsingDp(n-1,dp);
    //     }
    //     if(dp[n-2]!=-1){
    //         second=dp[n-2];
    //     }else{
    //         second=fibUsingDp(n-2,dp);
    //     }

    //     return first+second;
    // }
}
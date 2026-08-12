class Solution {
    public int fib(int n) {
        int []dp=new int[n+1];
        /* ==== for recursion
        Arrays.fill(dp,-1);
        return fibDP(n,dp);
        */
        if(n<=1)    return n;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    int fibDP(int n, int []dp){
        // base case
        if(n<=1)    return dp[n]=n;

        int prev;
        if(dp[n-1]!=-1){
            prev=dp[n-1];
        }else{
            prev=fibDP(n-1,dp);
        }
        int secondPrev;
        if(dp[n-2]!=-1){
            secondPrev=dp[n-2];
        }else{
            secondPrev=fibDP(n-2,dp);
        }
        return dp[n]=prev+secondPrev;
    }
}
class Solution {
    public int fib(int n) {
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);
        return fibDP(n,dp);
    }

    int fibDP(int n, int []dp){
        // base case
        if(n==0 || n==1)    return dp[n]=n;

        int prev;
        if(dp[n-1]!=-1){
            prev=dp[n-1];
        }else{
            prev=fib(n-1);
        }
        int secondPrev;
        if(dp[n-2]!=-1){
            secondPrev=dp[n-2];
        }else{
            secondPrev=fib(n-2);
        }
        return dp[n]=prev+secondPrev;
    }
}
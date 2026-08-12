class Solution {
    public int climbStairs(int n) {
    //     int dp[]=new int[n+1];
    //     Arrays.fill(dp,-1);
    //    return climbStairsDP(n,dp);

            // return iterativeDP(n);

            return optimisedFun(n);
    }

    int optimisedFun(int n){
         if(n<=2)    return n;
         int prev=2;
         int secondPrev=1;
         for(int i=3;i<=n;i++){
            int curr=prev+secondPrev;
            secondPrev=prev;
            prev=curr;
         }
         return prev;
    }

    int iterativeDP(int n){
         if(n<=2)    return n;
        int []dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
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
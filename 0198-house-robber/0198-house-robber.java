class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return robDp(n-1,nums,dp);
    }
    int robDp(int n,int []nums, int []dp)
    {
        if(n<0)    return 0;

        if(dp[n]!=-1)   return dp[n];
        int pick = robDp(n-2,nums,dp) + nums[n];
        int notPick = robDp(n-1,nums,dp);

        return dp[n]=Math.max(pick,notPick);
    }
}
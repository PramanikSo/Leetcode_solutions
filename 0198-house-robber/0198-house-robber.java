class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int []dp=new int[n];
        Arrays.fill(dp,-1);
        return robRecc(n-1,nums,dp);
    }
    int robRecc(int index,int []nums,int[]dp){
        if(index==0)    return dp[index]=nums[index];
        if(index<0) return 0;

        if(dp[index]!=-1){
            return dp[index];
        }
        int take=nums[index]+robRecc(index-2,nums,dp);
        // if(index>1){
        //     take+=robRecc(index-2,nums);
        // }
        int notTake=robRecc(index-1,nums,dp);
        return dp[index]=Math.max(take,notTake);

    }
}
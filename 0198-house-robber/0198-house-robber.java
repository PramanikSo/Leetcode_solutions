class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        dp[0]=nums[0];

        for(int i=1;i<nums.length;i++){
            int pick=Integer.MIN_VALUE;
            if(i>1){
                pick=dp[i-2]+nums[i];
            }else{
                pick=nums[i];
            }
            int notPick=dp[i-1];
            dp[i]=Math.max(pick,notPick);
        }
        return dp[n-1];
    }
   
}
class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2==1){
            return false;
        }
        sum=sum/2;
        int dp[][]=new int[nums.length][sum+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(nums.length-1,sum,nums,dp);
    }
     boolean helper(int index,int target,int []arr,int dp[][]){
        if(target==0){
            return true;
        }
        if(index==0){
            return (arr[index]==target);
        }
        if(dp[index][target]!=-1){
            return (dp[index][target]==1);
        }
         boolean nottake=helper(index-1,target,arr,dp);
        
        boolean take=false;
        if(target>=arr[index]){
             take=helper(index-1,target-arr[index],arr,dp);
        }
       
       
        
        dp[index][target] = (take || nottake)? 1:0;
        
        return (take || nottake);
        
    }
}
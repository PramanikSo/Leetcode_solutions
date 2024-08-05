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
        return isSubsetSum(nums.length,nums,sum);
    }
      Boolean isSubsetSum(int N, int arr[], int sum){
            boolean prev[]=new boolean[sum+1];
            
            prev[0]=true;
            if (arr[0] <= sum) {
               prev[arr[0]] = true;
            }
        // T(c): O(n*sum)
        for(int index=1;index<N;index++){
            boolean curr[]=new boolean[sum+1];
            curr[0]=true;
            for(int target=1;target<=sum;target++){
                 boolean notTake=prev[target];
                    boolean take = false;
                    if(target >= arr[index]){
                        take=prev[target-arr[index]];
                    }
                   curr[target]= (take || notTake) ;
            }
            prev=curr;
            
        }
           
        return prev[sum];
       
        
    }
}